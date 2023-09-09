import java.util.Scanner;;

public class Project1_Daniel_Potapov 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner input = new Scanner(System.in);
        

        int policyNum;
        String providerName;
        String firstName;
        String lastName;
        int age;
        String smokingStatus; 
        double height;
        double weight;


        System.out.println("Enter the policy number:");
        policyNum = input.nextInt();
        input.nextLine();
        System.out.println("Enter the policy provider name:");
        providerName = input.nextLine();
        System.out.println("Enter your first name");
        firstName = input.nextLine();
        System.out.println("Enter your last name");
        lastName = input.nextLine();
        System.out.println("Enter your age");
        age = input.nextInt();
        System.out.println("An active smoker?(smoker/non-smoker)");
        smokingStatus = input.nextLine();
        input.nextLine();
        System.out.println("How tall are you?(in inches)");
        height = input.nextDouble();
        System.out.println("How much do you weigh?(in pounds)");
        weight = input.nextDouble();

        Policy policy = new Policy(policyNum, providerName, firstName, lastName, age, smokingStatus, height, weight);

        System.out.println("Policy Number: " + policy.getPolicyNum());
        System.out.println("Policy Provider: " + policy.getproviderName());
        System.out.println("Policyholder's First Name: " + policy.getFirstName());
        System.out.println("Policyholder's Last Name: " + policy.getLastName());
        System.out.println("Policyholder's Age: " + policy.getAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder's Height: " + policy.getHeight());
        System.out.println("Policyholder's Weight: " + policy.getWeight());
        System.out.printf("Policyholder's BMI: %.2f", policy.bmiCalc());
        System.out.printf("\nPolicy Price: %.2f", policy.policyCost());      
    }
}
