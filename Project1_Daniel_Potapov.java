import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Project1_Daniel_Potapov 
{
    public static void main(String[] args) throws IOException 
    {
        File file = new File("src/PolicyInformation.txt");

        if(!file.exists())
        {
            System.out.println("File not found!");
            System.exit(0);
        }

        Scanner inputFile = new Scanner(file);

        ArrayList<Policy> policyList = new ArrayList<Policy>();

        int policyNum = 0;
        String providerName = "";
        String firstName = "";
        String lastName = "";
        int age = 0;
        String smokingStatus = ""; 
        double height = 0;
        double weight = 0;
        int numberOfNoneSmokers = 0;
        int numberOfSmokers = 0;


        while(inputFile.hasNext())
        {
            policyNum = inputFile.nextInt();
            inputFile.nextLine();

            providerName = inputFile.nextLine();

            firstName = inputFile.nextLine();

            lastName = inputFile.nextLine(); 

            age = inputFile.nextInt();
            
            smokingStatus = inputFile.next();
            inputFile.nextLine();

            height = inputFile.nextDouble();

            weight = inputFile.nextDouble();  
            
            Policy policy = new Policy(policyNum, providerName, firstName, lastName, age, smokingStatus, height, weight);

            policyList.add(policy);

            if(smokingStatus.equals("smoker"))
            {
                numberOfSmokers += 1;
            }else if(smokingStatus.equals("non-smoker"))
            {
                numberOfNoneSmokers += 1;
            }

            System.out.println("\n\nPolicy Number: " + policy.getPolicyNum());
            System.out.println("Policy Provider: " + policy.getproviderName());
            System.out.println("Policyholder's First Name: " + policy.getFirstName());
            System.out.println("Policyholder's Last Name: " + policy.getLastName());
            System.out.println("Policyholder's Age: " + policy.getAge());
            System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
            System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
            System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
            System.out.printf("Policyholder's BMI: %.2f", policy.bmiCalc());
            System.out.printf("\nPolicy Price: $%.2f", policy.policyCost()); 
            System.out.println("\n\nThe number of policies with a smoker is: " + numberOfSmokers);
            System.out.println("\nThe number of policies with a non-smoker is: " + numberOfNoneSmokers);
        }


            
    
             
    }
}
