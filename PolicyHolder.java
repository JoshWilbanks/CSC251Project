public class PolicyHolder
{
   //variables
   private int age = 0;
   private String firstName, lastName, smokingStatus;
   private float height, weight;

   /**
      No arg constructor
   */
   public PolicyHolder()
   {
      age = 0;
      firstName = "Unknown";
      lastName = "Unknown";
      smokingStatus = "Unknown";
      height = 0f;
      weight = 0f;
   
   }
   
   //constructor, takes in all values
   /**
      Constructor accepting arguments for each field
      @param _firstName The first name of the account holder
      @param _lastName The last name of the account holder
      @param _age The age of the account holder
      @param _smokingStatus The smoking status of the account holder
      @param _height The height of the account holder
      @param _weight The weight of the account holder
   */
   public PolicyHolder(String _firstName, String _lastName, int _age, String _smokingStatus, float _height, float _weight)
   {
      age = _age;
      firstName = _firstName;
      lastName = _lastName;
      smokingStatus = _smokingStatus;
      height = _height;
      weight = _weight;
   
   }
   
      //getters      
      /**
         The getAge method gets the age of the policy holder
         @return The age of the policy holder
      */
      public int getAge() { return age; }
            
      /**
         The getFirstName method gets the first name of the policy holder
         @return The first name of the policy holder
      */
      public String getFirstName() { return firstName; }
            
      /**
         The getLastName method gets the last name of the policy holder
         @return The last name of the policy holder
      */
      public String getLastName() { return lastName; }
            
      /**
         The getSmokingStatus method gets smoking status the of the policy holder
         @return The smoking status of the policy holder
      */
      public String getSmokingStatus() { return smokingStatus; }
            
      /**
         The getHeight method gets the height of the policy holder
         @return The height of the policy holder
      */
      public float getHeight() { return height; }
            
      /**
         The getWeight method gets the weight of the policy holder
         @return The weight of the policy holder
      */
      public float getWeight() { return weight; }
      
      
      //-------------------------------------------------------------------------------------------------------------------
      //setters      
      /**
         The setAge method sets the age of the policy holder
         @param _age The age of the policy holder
      */
      public void setAge(int _age) { age = _age; }
      /**
         The setFirstName method sets the first name of the policy holder
         @param _firstName The first name of the policy holder
      */
      public void setFirstName(String _firstName) { firstName = _firstName; }
      
      /**
         The setLastName method sets the last name of the policy holder
         @param _lastName The last name of the policy holder
      */
      public void setLastName(String _lastName) { lastName = _lastName; }
      
      /**
         The setSmokingStatus method sets smoking status the of the policy holder
         @param _smokingStatus The smoking status of the policy holder
      */
      public void setSmokingStatus(String _smokingStatus) { smokingStatus = _smokingStatus; }
      
      /**
         The setHeight method sets the height of the policy holder
         @param _height The height of the policy holder
      */
      public void setHeight(float _height) { height = _height; }
      
      /**
         The setWeight method sets the weight of the policy holder
         @param _weight The weight of the policy holder
      */
      public void setWeight(float _weight) { weight = _weight; }
      
      

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
         toString returns a string containing all the variables a given policy holder has
         All of the variables:
            age
            firstName
            lastName
            smokingStatus
            height
            weight
         @return The string containing all of the policy holder's variables
      */
      public String toString()
      {
         String str = "";
         str += "Age: " + age + "\n";
         str += "First Name: " + firstName + "\n";
         str += "Last Name: " + lastName + "\n";
         str += "Smoking Status: " + smokingStatus + "\n";
         str += "Height: " + height + "\n";
         str += "Weight: " + weight + "\n";
         
         return str;
      }
}