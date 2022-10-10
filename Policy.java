public class Policy
{
   //variables
   private int policyNumber, age;
   private String providerName, firstName, lastName, smokingStatus;
   private float height, weight;


   /**
      No arg constructor
   */
   public Policy()
   {
      policyNumber = 0;
      age = 0;
      providerName = "Unknown";
      firstName = "Unknown";
      lastName = "Unknown";
      smokingStatus = "Unknown";
      height = 0f;
      weight = 0f;
   
   }
   
   //constructor, takes in all values
   /**
      Constructor accepting arguments for each field
      @param _policyNumber The policy number attatched to the account
      @param _age The age of the account holder
      @param _providerName The name of the policy provider
      @param _firstName The first name of the account holder
      @param _lastName The last name of the account holder
      @param _smokingStatus The smoking status of the account holder
      @param _height The height of the account holder
      @param _weight The weight of the account holder
   */
   public Policy(int _policyNumber, int _age, String _providerName, String _firstName, String _lastName, String _smokingStatus, float _height, float _weight)
   {
      policyNumber = _policyNumber;
      age = _age;
      providerName = _providerName;
      firstName = _firstName;
      lastName = _lastName;
      smokingStatus = _smokingStatus;
      height = _height;
      weight = _weight;
   
   }
   
      //getters
      /**
         The getPolicyNumber method sets the policy number of the policy
         @return The policy number of the policy
      */
      public int getPolicyNumber() { return policyNumber; }
      
      /**
         The getAge method sets the age of the policy holder
         @return The age of the policy holder
      */
      public int getAge() { return age; }
      
      /**
         The getProviderName method sets the provider name of the policy
         @return The provider name attatched of the policy
      */
      public String getProviderName() { return providerName; }
            
      /**
         The getFirstName method sets the first name of the policy holder
         @return The first name of the policy holder
      */
      public String getFirstName() { return firstName; }
            
      /**
         The getLastName method sets the last name of the policy holder
         @return The last name of the policy holder
      */
      public String getLastName() { return lastName; }
            
      /**
         The getSmokingStatus method sets smoking status the of the policy holder
         @return The smoking status of the policy holder
      */
      public String getSmokingStatus() { return smokingStatus; }
            
      /**
         The getHeight method sets the height of the policy holder
         @return The height of the policy holder
      */
      public float getHeight() { return height; }
            
      /**
         The getWeight method sets the weight of the policy holder
         @return The weight of the policy holder
      */
      public float getWeight() { return weight; }
      
      
      //-------------------------------------------------------------------------------------------------------------------
      //setters
      /**
         The getPolicyNumber method sets the policy number of the policy
         @param The policy number of the policy
      */
      public void getPolicyNumber(int _policyNumber) { policyNumber = _policyNumber; }
      
      /**
         The getAge method sets the age of the policy holder
         @param The age of the policy holder
      */
      public void getAge(int _age) { age = _age; }
      
      /**
         The getProviderName method sets the provider name of the policy
         @param The provider name attatched of the policy
      */
      public void getProviderName(String _providerName) { providerName = _providerName; }
      
      /**
         The getFirstName method sets the first name of the policy holder
         @param The first name of the policy holder
      */
      public void getFirstName(String _firstName) { firstName = _firstName; }
      
      /**
         The getLastName method sets the last name of the policy holder
         @param The last name of the policy holder
      */
      public void getLastName(String _lastName) { lastName = _lastName; }
      
      /**
         The getSmokingStatus method sets smoking status the of the policy holder
         @param The smoking status of the policy holder
      */
      public void getSmokingStatus(String _smokingStatus) { smokingStatus = _smokingStatus; }
      
      /**
         The getHeight method sets the height of the policy holder
         @param The height of the policy holder
      */
      public void getHeight(float _height) { height = _height; }
      
      /**
         The getWeight method sets the weight of the policy holder
         @param The weight of the policy holder
      */
      public void getWeight(float _weight) { weight = _weight; }
      
      

      /**
         calculateBMI calculates the body mass index (BMI) of the policy holder
         BMI is calculated as weight * 703 / height²
         @return The calculated BMI
      */
      public float calculateBMI()
      {
         return (weight * 703) / (height * height);
      }
      
      /**
         calculatePolicyPrice calculates the price of the policy based on a number of factors
         Base price is 600
         If the policy holder is over 50 add 75$
         If the policy holder is a smoker add 100$
         If the policy holder has a BMI over 35 add 20$ for every BMI point over 35 (ex. a 40 BMI = (40 - 35) * 20 = 100$ increase)
         @return The price calculated
      */
      public float calculatePolicyPrice()
      {
         float price = 600;
         if(age > 50) price += 75;
         if(smokingStatus.toLowerCase() == "smoker") price += 100;
         
         float bmi = calculateBMI();
         if(bmi > 35) price += (bmi - 35) * 20;
         
         return price;
      }

}