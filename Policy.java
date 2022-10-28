public class Policy
{
   //variables
   private int policyNumber;
   private String providerName;
   private static int policyObjectsCount = 0;


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
      Constructor accepting arguments for each field
      @param _policyNumber The policy number attatched to the account
      @param _providerName The name of the policy provider
   */
   public Policy(int _policyNumber, String _providerName)
   {
      policyNumber = _policyNumber;
      providerName = _providerName;
      
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
         if(age > 50) price += 75;
         if(smokingStatus.toLowerCase() == "smoker") price += 100;
         
         float bmi = calculateBMI();
         if(bmi > 35) price += (bmi - 35) * 20;
         
         return price;
      }
      
      /**
         toString returns a string containing all the variables a given policy has
         All of the variables:
            policyNumber;
            providerName;

         @return The string containing all of the policy's variables
      */
      public String toString()
      {
         String str = "";
         str += "Policy Number: " + policyNumber + "\n";
         str += "Provider Name " + providerName + "\n";
         
         return str;
      }

}