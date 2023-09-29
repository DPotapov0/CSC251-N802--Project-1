/**
 * This Class represents a person's insurance policy
 */

public class Policy 
{
    private int policyNum;
    private String providerName;
    private String firstName;
    private String lastName;
    private int Age;
    private String smokingStatus;
    private double height;
    private double weight;
    private double BMI;

    /**
     * Default Constructor of the Policy Class
     */
    Policy()
    {
        policyNum = 0;
        providerName = "";
        firstName = "";
        lastName = "";
        Age = 1;
        smokingStatus = "non-smoker";
        height = 1;
        weight = 1;   
        BMI = 0;
    }

    /**
     * The insurance policie's constructor with all the fileds as paramaters
     * @param policyNum the policy number
     * @param providerName the policy provider name
     * @param firstName the first name of the policy holder
     * @param lastName the last name of the policy holder
     * @param Age the age of the policy holder
     * @param smokingStatus the smoking status of the policy holder
     * @param height the height of the policy holder
     * @param weight the weight of the policy holder
     */
    Policy(int policyNum, String providerName, String firstName, String lastName, int Age, String smokingStatus, double height, double weight)
    {
        this.policyNum = policyNum;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Age = Age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;  
    }

    /**
     * Gets the policy number
     * @return the policyNum
     */
    public int getPolicyNum()
    {
        return policyNum;
    }

    /**
     * Gets the policy provider name
     * @return the providerName
     */
    public String getproviderName()
    {
        return providerName;
    }

    /**
     * Gets the policy holder's first name
     * @return the firstName
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * Gets the policy holder's last name
     * @return the lastName
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * Gets the policy holder's age
     * @return the Age
     */
    public int getAge()
    {
        return Age;
    }

    /**
     * Gets the policy holder's smoking-status
     * @return the smokingStatus
     */
    public String getSmokingStatus()
    {
        return smokingStatus;
    }

    /**
     * Gets the policy holder's height
     * @return the height
     */
    public double getHeight()
    {
        return height;
    }

    /**
     * Gets the policy holder's weight
     * @return the weight
     */
    public double getWeight()
    {
        return weight;
    }

    /**
     * Calculates the bmi and returns it
     * @return BMI
     */
    public double bmiCalc()
    {
        BMI = (weight * 703) / (height * height);

        return BMI;
    }

    /**
     * Calculates the total policy cost
     * @return policyCost
     */
    public double policyCost()
    {
        double policyCost = 0;
        final int BASE_COST = 600;

        policyCost += BASE_COST;
        if(Age > 50)
        {
            policyCost += 75;
        }

        if(smokingStatus.equals("smoker"))
        {
            policyCost += 100;
        }

        if(BMI > 35)
        {
            policyCost += ((BMI - 35) * 20);
        }


        return policyCost;
    }

}
