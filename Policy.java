/**
 * This Class represents a person's insurance policy
 */

public class Policy 
{
    private int policyNum;
    private String providerName;
    private policyHolder policyHolder;
    public static int totalPolicies = 0;

    /**
     * Default Constructor of the Policy Class
     */
    Policy()
    {
        policyNum = 0;
        providerName = "";
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
    Policy(int policyNum, String providerName, policyHolder policyHolder)
    {
        this.policyNum = policyNum;
        this.providerName = providerName;
        this.policyHolder = policyHolder;
        totalPolicies += 1;
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
     * Calculates the total policy cost
     * @return policyCost
     */
    public double policyCost()
    {
        double policyCost = 0;
        final int BASE_COST = 600;

        policyCost += BASE_COST;
        if(policyHolder.getAge() > 50)
        {
            policyCost += 75;
        }

        if(policyHolder.getSmokingStatus().equals("smoker"))
        {
            policyCost += 100;
        }

        if(policyHolder.bmiCalc() > 35)
        {
            policyCost += ((policyHolder.bmiCalc() - 35) * 20);
        }

        return policyCost;
    }

    public String toString()
    {
        return "\n\nPolicy Number: " + policyNum + 
               "\nPolicy Provider: " + providerName +
               "\n" + policyHolder.toString() + 
               String.format("\nPolicy Price: $%.2f", policyCost()); 
    }

}
