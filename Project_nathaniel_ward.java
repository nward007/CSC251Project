/* PROJECT, CSC251, Nathaniel Ward */
import java.util.*;
import java.io.*;

public class Project_nathaniel_ward
{
   public static void main(String args[])
   {
      try
      {
         // Scanner and variables
         Scanner keyboard = new Scanner(System.in);
         File file = new File("PolicyInformation.txt");
         Scanner inputFile = new Scanner(file);
      
         ArrayList<Policy> policies = new ArrayList<Policy>();
      
         int policyNumber, holderAge, holderHeight, holderWeight;
         String providerName, holderFirstName, holderLastName, holderSmokingStatus;
         
         while(inputFile.hasNext())
         {
            policyNumber = inputFile.nextInt();
            inputFile.nextLine();
            providerName = inputFile.nextLine();
            holderFirstName = inputFile.nextLine();
            holderLastName = inputFile.nextLine();
            holderAge = inputFile.nextInt();
            inputFile.nextLine();
            holderSmokingStatus = inputFile.nextLine();
            holderHeight = inputFile.nextInt();
            inputFile.nextLine();
            holderWeight = inputFile.nextInt();
            
            // Eat whitespace (might need two nextLine() statements)
            if(inputFile.hasNext())
            {
               inputFile.nextLine();
               inputFile.nextLine();
            }
            
            // Create new Policy object and add to policies ArrayList            
            policies.add(new Policy(policyNumber, providerName, holderFirstName, holderLastName, 
                                    holderAge, holderSmokingStatus, holderHeight, holderWeight));
            
         }// END WHILE LOOP
         
         // Output results
         for (int s=0; s<policies.size(); s++)
         {
            System.out.println("Policy Number: " + policies.get(s).getPolicyNumber());
            System.out.println("Provider's Name: " + policies.get(s).getProviderName());
            System.out.println("Policyholder's First Name: " + policies.get(s).getHolderFirstName());
            System.out.println("Policyholder's Last Name: " + policies.get(s).getHolderLastName());
            System.out.println("Policyholder's Age: " + policies.get(s).getHolderAge());
            System.out.println("Policyholder's Smoking Status: " + policies.get(s).getHolderSmokingStatus());
            System.out.println("Policyholder's Height: " + policies.get(s).getHolderHeight());
            System.out.println("Policyholder's Weight: " + policies.get(s).getHolderWeight());
            System.out.println("Policyholder's BMI: " + policies.get(s).calculateHolderBMI());
            System.out.println("Policy Price: " + String.format("$%.2f", policies.get(s).calculatePolicyPrice()));
            System.out.println("\n");
         }// END FOR
         
         // Close keyboard and file 
         keyboard.close();
         inputFile.close();
      }// END TRY
      catch(IOException ex)
      {
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }//END CATCH
   }
}