import java.util.Scanner;

public class Project1_Josh_Wilbanks
{   
   
   public static void main(String[] args)
   {
      //display title
      System.out.println("Insurance Calculator v1\n\n");
   
      //create user policy
      Policy userPolicy = createUserPolicy();
      
      //display policy information
      displayPolicyInfo(userPolicy);
      
      
      
   }
   
   //create user policy
   public static Policy createUserPolicy()
   {
      //variables
      int policyNumber, age;
      String providerName, firstName, lastName, smokingStatus;
      float height, weight;
      
      //scanner
      Scanner keyboard = new Scanner(System.in);
      
      //get user input for policy information
      System.out.print("Please enter your Policy Number: ");
      policyNumber = keyboard.nextInt();
      
      //eats and enter
      keyboard.nextLine();
      
      System.out.print("\nPlease enter your Provider Name: ");
      providerName = keyboard.nextLine();
      
      System.out.print("\nPlease enter your First Name: ");
      firstName = keyboard.nextLine();
      
      System.out.print("\nPlease enter your Last Name: ");
      lastName = keyboard.nextLine();
      
      smokingStatus = getSmokingStatus();
      
      System.out.print("\nPlease enter your Age: ");
      age = keyboard.nextInt();
      
      System.out.print("\nPlease enter your Height (in inches): ");
      height = keyboard.nextFloat();
      
      System.out.print("\nPlease enter your Weight (in pounds): ");
      weight = keyboard.nextFloat();
      
      //create and return new policy with user information
      return new Policy(policyNumber, age, providerName, firstName, lastName, smokingStatus, height, weight);
   }
   
   //gets smoking status of user
   //necessary for data formatting
   public static String getSmokingStatus()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("\nPlease enter your Smoking Status from the menu below ");
      System.out.println("\t 1. Smoker \t 2.Non-Smoker");
      int smokingStatusInt = keyboard.nextInt();
      if(smokingStatusInt == 1) return "Smoker";
      return "Non-Smoker";
   
   }
   
   //display policy information
   public static void displayPolicyInfo(Policy userPolicy)
   {
      System.out.println("\nPolicy Number: " + userPolicy.getPolicyNumber());
      System.out.println("Provider Name: " + userPolicy.getProviderName());
      System.out.println("First Name: " + userPolicy.getFirstName());
      System.out.println("Last Name: " + userPolicy.getLastName());
      System.out.println("Age: " + userPolicy.getAge());
      System.out.println("Smoking Status: " + userPolicy.getSmokingStatus());
      System.out.println("Height: "  + userPolicy.getHeight());
      System.out.println("Weight: "  + userPolicy.getWeight());
      System.out.printf("Policy Price: $%,.2f", userPolicy.calculatePolicyPrice());
   
   
   }
   
}