/* POLICY CLASS, CSC251, Nathaniel Ward */

public class Policy
{
   // Static field
   public static int policyObjects = 0;
   // Data fields
   private int number;
   private String providerName;
   
   /*
     No-arg constructor to set default values
   */
   public Policy()
   {
      this.number = 12345;
      this.providerName = "CSC251 Insurance";
   }
   
   /*
     Constructor that accepts arguments
     @param
   */
   public Policy(int number, String providerName)
   {
      this.number = number;
      this.providerName = providerName;
   }
   
   /*
     Sets policy number
     @param number integer for the policy number to be set
   */
   public void setNumber(int number)
   {
      this.number = number;
   }
   
   /*
     Sets provider name
     @param providerName String of the provider's name
   */
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
   
   /*
     Gets policy number
     @return policyNumber integer
   */
   public int getPolicyNumber()
   {
      return this.number;
   }
   
   /*
     Gets provider's name
     @return providerName String
   */
   public String getProviderName()
   {
      return this.providerName;
   }
   
   /*
     toString method
     @return String value output information
   */
   public String toString()
   {
      return "\nPolicy Number: " + this.getPolicyNumber() + "\nProvider's Name: " + this.getProviderName() + "\n";
   }
   
}