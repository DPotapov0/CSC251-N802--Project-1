import java.util.Scanner;;

public class Project1_Daniel_Potapov 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner input = new Scanner(System.in);
        Policy policy = new Policy();

        System.out.println("Enter the policy number:");
        policy.policyNum(input.nextInt());
        System.out.println("Enter the policy provider name:");
        policy.providerName(input.next());
        System.out.println("Enter your first name");
        policy.firstName(input.next());
        System.out.println("Enter your last name");
        policy.lastName(input.next());
        System.out.println("Enter your age");
        policy.Age(input.nextInt());
        System.out.println("An active smoker?(smoker/non-smoker)");
        policy.smokingStatus(input.next());
        System.out.println("How tall are you?(in inches)");
        policy.Height(input.nextInt());
        System.out.println("How much do you weigh?(in pounds)");
        policy.Weight(input.nextInt());

        System.out.println("Policy Number: " + policy.getPolicyNum());
        System.out.println("Policy Prover: " + policy.getproviderName());
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
