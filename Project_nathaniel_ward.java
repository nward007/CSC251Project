/* PROJECT, CSC251, Nathaniel Ward */
import java.util.Scanner;

public class Project_nathaniel_ward
{
   public static void main(String args[])
   {
      // Scanner
      Scanner keyboard = new Scanner(System.in);
      
      // Prompt user for inputs
      System.out.println("Please enter the Policy Number: ");
      int policyNumber = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.println("Please enter the Provider Name: ");
      String providerName = keyboard.nextLine();
      
      System.out.println("Please enter the Policyholder’s First Name: ");
      String holderFirstName = keyboard.nextLine();
      
      System.out.println("Please enter the Policyholder’s Last Name: ");
      String holderLastName = keyboard.nextLine();
      
      System.out.println("Please enter the Policyholder’s Age: ");
      int holderAge = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.println("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      String holderSmokingStatus = keyboard.nextLine();
      
      System.out.println("Please enter the Policyholder’s Height (in inches): ");
      int holderHeight = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.println("Please enter the Policyholder’s Weight (in pounds): ");
      int holderWeight = keyboard.nextInt();
      keyboard.nextLine();
      
      // Instantiate object
      Policy Policy1 = new Policy(policyNumber, providerName, holderFirstName, holderLastName, holderAge, holderSmokingStatus, holderHeight, holderWeight);
      
      // Output results
      System.out.println("Policy Number: " + Policy1.getPolicyNumber());
      System.out.println("Provider Name: " + Policy1.getProviderName());
      System.out.println("Policyholder’s First Name: " + Policy1.getHolderFirstName());
      System.out.println("Policyholder’s Last Name: " + Policy1.getHolderLastName());
      System.out.println("Policyholder’s Age: " + Policy1.getHolderAge());
      System.out.println("Policyholder’s Smoking Status: " + Policy1.getHolderSmokingStatus());
      System.out.println("Policyholder’s Height: " + Policy1.getHolderHeight());
      System.out.println("Policyholder’s Weight: " + Policy1.getHolderWeight());
      System.out.println("Policyholder’s BMI: " + Policy1.calculateHolderBMI());
      System.out.println("Policy Price: " + String.format("$%.2f", Policy1.calculatePolicyPrice()));
      
      // Close keyboard
      keyboard.close();
   }
}