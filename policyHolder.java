/**
 * This Class represents the policy holder's information
 */

public class policyHolder 
{
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
    policyHolder()
    {
        firstName = "";
        lastName = "";
        Age = 1;
        smokingStatus = "non-smoker";
        height = 1;
        weight = 1;   
        BMI = 0;
    }

    /**
     * The insurance policy holder's constructor with all the fields
     * @param firstName the first name of the policy holder
     * @param lastName the last name of the policy holder
     * @param Age the age of the policy holder
     * @param smokingStatus the smoking status of the policy holder
     * @param height the height of the policy holder
     * @param weight the weight of the policy holder
     */
    policyHolder(String firstName, String lastName, int Age, String smokingStatus, double height, double weight)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Age = Age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
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

    
}
