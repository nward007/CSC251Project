/* POLICY CLASS, CSC251, Nathaniel Ward */

public class Policy
{
   // Static field
   public static int policyObjects = 0;
   // Data fields
   private int number;
   private String providerName;
   // Policy holder object
   private PolicyHolder policyHolder;
   
   /*
     No-arg constructor to set default values
     Added object increment counter
   */
   public Policy()
   {
      policyObjects++;
      this.number = 12345;
      this.providerName = "CSC251 Insurance";
      this.policyHolder = new PolicyHolder();
   }
   
   /*
     Constructor that accepts arguments
     @param
   */
   public Policy(int number, String providerName, PolicyHolder policyHolder)
   {
      policyObjects++;
      this.number = number;
      this.providerName = providerName;
      this.policyHolder = new PolicyHolder(policyHolder);
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
     Returns policyHolder object
     @return PolicyHolder object
   */
   public PolicyHolder getPolicyHolder()
   {
      return this.policyHolder;
   }
   
   /*
     toString method
     @return String value output information
   */
   public String toString()
   {
      return "Policy Number: " + this.getPolicyNumber() + "\nProvider's Name: " + this.getProviderName();
   }
   
}