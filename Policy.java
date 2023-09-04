public class Policy 
{
    int policyNum;
    String providerName;
    String firstName;
    String lastName;
    int Age;
    String smokingStatus;
    double height;
    double weight;
    double BMI;

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

    public void policyNum(int policyNum)
    {
        this.policyNum = policyNum;
    }
    public int getPolicyNum()
    {
        return policyNum;
    }

    public void providerName(String providerName)
    {
        this.providerName = providerName;
    }
    public String getproviderName()
    {
        return providerName;
    }

    public void firstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getFirstName()
    {
        return firstName;
    }

    public void lastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getLastName()
    {
        return lastName;
    }

    public void Age(int Age)
    {
        this.Age = Age;
    }
    public int getAge()
    {
        return Age;
    }

    public void smokingStatus(String smokingStatus)
    {
        this.smokingStatus = smokingStatus;
    }
    public String getSmokingStatus()
    {
        return smokingStatus;
    }

    public void Height(double height)
    {
        this.height = height;
    }
    public double getHeight()
    {
        return height;
    }

    public void Weight(double weight)
    {
        this.weight = weight;
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
