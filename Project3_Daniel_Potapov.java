import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Project3_Daniel_Potapov 
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
        ArrayList<policyHolder> policyHolders = new ArrayList<policyHolder>();

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
            
            policyHolder policyHolder = new policyHolder(firstName, lastName, age, smokingStatus, height, weight);
            Policy policy = new Policy(policyNum, providerName, policyHolder);

            policyList.add(policy);
            policyHolders.add(policyHolder);

            if(smokingStatus.equals("smoker"))
            {
                numberOfSmokers += 1;
            }else if(smokingStatus.equals("non-smoker"))
            {
                numberOfNoneSmokers += 1;
            }

            System.out.println(policy.toString());
            System.out.println("\n\nThe number of policies with a smoker is: " + numberOfSmokers);
            System.out.println("\nThe number of policies with a non-smoker is: " + numberOfNoneSmokers);
        }


            
    
             
    }
}
