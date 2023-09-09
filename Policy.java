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

    public int getPolicyNum()
    {
        return policyNum;
    }

    public String getproviderName()
    {
        return providerName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getAge()
    {
        return Age;
    }

    public String getSmokingStatus()
    {
        return smokingStatus;
    }

    public double getHeight()
    {
        return height;
    }

    public double getWeight()
    {
        return weight;
    }

    public double bmiCalc()
    {
        BMI = (weight * 703) / (height * height);

        return BMI;
    }

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
