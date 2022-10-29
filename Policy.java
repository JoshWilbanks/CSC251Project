public class Policy
{
   //variables
   private static int policyObjectsCount = 0;
   private int policyNumber;
   private String providerName;
   public PolicyHolder policyHolder;


   /**
      No arg constructor
   */
   public Policy()
   {
      policyNumber = 0;
      providerName = "Unknown";
      
      policyObjectsCount++;
   }
   
   //constructor, takes in all values
   /**
      Constructor accepting arguments for each field, and for all the fields of a new PolicyHolder
      @param _policyNumber The policy number attatched to the account
      @param _providerName The name of the policy provider
      @param _firstName The first name of the policy holder
      @param _lastName The last name of the policy holder
      @param _age The age of the policy holder
      @param _smokingStatus The smoking status of the policy holder
      @param _height The height of the policy holder
      @param _weight The weight of the policy holder
   */
   public Policy(int _policyNumber, String _providerName, String _firstName, String _lastName, int _age, String _smokingStatus, float _height, float _weight)
   {
      policyNumber = _policyNumber;
      providerName = _providerName;
      
      policyHolder = new PolicyHolder(_firstName, _lastName, _age, _smokingStatus, _height, _weight);
      
      policyObjectsCount++;
   }
   
      //getters
      /**
         The getPolicyNumber method gets the policy number of the policy
         @return The policy number of the policy
      */
      public int getPolicyNumber() { return policyNumber; }

      /**
         The getProviderName method gets the provider name of the policy
         @return The provider name attatched of the policy
      */
      public String getProviderName() { return providerName; }
      
      
      //-------------------------------------------------------------------------------------------------------------------
      //setters
      /**
         The getPolicyNumber method sets the policy number of the policy
         @param _policyNumber The policy number of the policy
      */
      public void setPolicyNumber(int _policyNumber) { policyNumber = _policyNumber; }

      /**
         The setProviderName method sets the provider name of the policy
         @param _providerName The provider name attatched of the policy
      */
      public void setProviderName(String _providerName) { providerName = _providerName; }
      
            
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
         if(policyHolder.getAge() > 50) price += 75;
         if(policyHolder.getSmokingStatus().toLowerCase() == "smoker") price += 100;
         
         float bmi = policyHolder.calculateBMI();
         if(bmi > 35) price += (bmi - 35) * 20;
         
         return price;
      }
      
      /**
         toString returns a string containing all the variables a given policy has, and all of the variables the attached PolicyHolder has
         All of the variables:
            policyNumber;
            providerName;

         @return The string containing all of the policy's and attached policy holder's variables
      */
      public String toString()
      {
         String str = "";
         str += "Policy Number: " + policyNumber + "\n";
         str += "Provider Name " + providerName + "\n";
         str += policyHolder.toString();
         
         return str;
      }

}