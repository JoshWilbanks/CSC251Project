import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class Demo
{   
   static final String FILE_NAME = "PolicyInformation.txt";
   
   public static void main(String[] args) throws IOException
   {
      final ArrayList<Policy> policies;
   
      //display title
      System.out.println("Insurance Calculator v2");
      
      //create an array list of user policies from the text file
      policies = createUserPoliciesFromTextFile(FILE_NAME);
      
      //display all the policies information in the array list created
      displayAllPoliciesInfo(policies);
      
      
   }
   
   
   /**
      createUserPoliciesFromTextFile Takes in a file name and creates user policies based on information inside said file and returns an array containing all policies created
      @param fileName The name of the file. Can be a path.
      @return A list of all user policies created from the text file
   */
   //create an array list of policies from a text file
   public static ArrayList<Policy> createUserPoliciesFromTextFile(String fileName) throws IOException
   {
      //array to hold all policies imported from file
      ArrayList<Policy> policies = new ArrayList<Policy>();
      
      //create file obj from passed file string name
      File policyInformation = new File(fileName);
      
      //check if file doesn't exist
      if(!policyInformation.exists())
      {
         System.out.println("Error! File does not exists.");
         System.exit(0);
      
      }
      
      //create scanner to read input from file
      Scanner inputFile = new Scanner(policyInformation);
      
      //while inputFile still has text to read keep looping
      while(inputFile.hasNext())
      {
         //read next batch of variables from the file
         //some extra nextLine's are needed to reset the scanner
         int policyNumber = inputFile.nextInt();
         inputFile.nextLine();
         String providerName = inputFile.nextLine();
         String firstName = inputFile.nextLine();
         String lastName = inputFile.nextLine();
         int age = inputFile.nextInt();
         inputFile.nextLine();
         String smokingStatus = inputFile.nextLine();
         float height = inputFile.nextFloat();
         float weight = inputFile.nextFloat();
         
         //create policy from variables read in and add it to the array list
         policies.add(new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight));
      }
   
      return policies;
   }
   
   //create a single user policy based on user input
   /**
      createUserPolicyFromUserInput Prompts user for input for a policy and returns the policy obj created based on the user input
      @return Policy created from user input
   */
   public static Policy createUserPolicyFromUserInput()
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
      return new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
   }
   
   //gets smoking status of user
   //necessary for data formatting
   /**
      getSmokingStatus prompts the user for their smoking status formats the data appropriately
      @return The formatted smoking status
   */
   public static String getSmokingStatus()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("\nPlease enter your Smoking Status from the menu below ");
      System.out.println("\t 1. Smoker \t 2.Non-Smoker");
      int smokingStatusInt = keyboard.nextInt();
      if(smokingStatusInt == 1) return "Smoker";
      return "Non-Smoker";
   
   }
   
   //display a single policy's information
   /**
      displaySinglePolicyInfo displays all the information from a single policy
      @param userPolicy The policy who's information is to be displayed
   */
   public static void displaySinglePolicyInfo(Policy userPolicy)
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
      System.out.println();
   
   
   }
   
   //display policy information of all policies in an array list
   /**
      displayAllPoliciesInfo itirates through a list of policies and displays each policies information, as well as keeps a running total of smokers vs non smokers and displays the total at the end
      @param policies The array list of policies to iterate through and display information of
   */
   public static void displayAllPoliciesInfo(ArrayList<Policy> policies)
   {
      //variables
      int smokers = 0;
   
      //loop through entire array list and display each policy
      for(int i = 0; i < policies.size(); i++)
      {
         //display infor for policy i
         displaySinglePolicyInfo(policies.get(i));
         
         //add to smokers counter for every policy with a smoking status of "smoker"
         if(policies.get(i).getSmokingStatus().equals("smoker")) smokers++;
      
      }
      
      //display total count of smokers and non-smokers
      System.out.println();
      System.out.println("The number of policies with a smoker is: " + smokers);
      System.out.println("The number of policies with a non-smoker is: " + (policies.size() - smokers));
   
   }
   
}