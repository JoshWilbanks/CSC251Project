public class Policy
{
   //variables
   private int policyNumber, age;
   private String providerName, firstName, lastName, smokingStatus;
   private float height, weight;
   
   //constructor, sets defaults
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
      public int getPolicyNumber() { return policyNumber; }
      public int getAge() { return age; }
      public String getProviderName() { return providerName; }
      public String getFirstName() { return firstName; }
      public String getLastName() { return lastName; }
      public String getSmokingStatus() { return smokingStatus; }
      public float getHeight() { return height; }
      public float getWeight() { return weight; }
      
      //setters
      public void getPolicyNumber(int _policyNumber) { policyNumber = _policyNumber; }
      public void getAge(int _age) { age = _age; }
      public void getProviderName(String _providerName) { providerName = _providerName; }
      public void getFirstName(String _firstName) { firstName = _firstName; }
      public void getLastName(String _lastName) { lastName = _lastName; }
      public void getSmokingStatus(String _smokingStatus) { smokingStatus = _smokingStatus; }
      public void getHeight(float _height) { height = _height; }
      public void getWeight(float _weight) { weight = _weight; }
      
      //calculates bmi
      public float calculateBMI()
      {
         return (weight * 703) / (height * height);
      }
      
      //calculates price of insurance policy
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