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
            PolicyHolder policyHolder = new PolicyHolder(holderFirstName, holderLastName, holderAge, holderSmokingStatus, holderHeight, holderWeight);
            policies.add(new Policy(policyNumber, providerName, policyHolder));
            
         }// END WHILE LOOP
         
         // Output results
         int numberOfSmokers = 0;
         for (int s=0; s<policies.size(); s++)
         {
            System.out.println(policies.get(s));
            System.out.println(policies.get(s).getPolicyHolder());
            System.out.println("\n");
            if (policies.get(s).getPolicyHolder().getHolderSmokingStatus().equals("smoker"))
            {
               numberOfSmokers++;
            }
         }// END FOR
         
         // Display the number of Policyholders that are smokers and the number of Policyholders that are non-smokers.
         // Display the number of Policy objects created
         System.out.println("There were " + Policy.policyObjects + " policy objects created.");
         System.out.println("The number of policies with a smoker is: " + numberOfSmokers);
         System.out.println("The number of policies with a non-smoker is: " + (policies.size() - numberOfSmokers));
         
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