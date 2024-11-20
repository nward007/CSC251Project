/* PROJECT, CSC251, NATHANIEL WARD */

public class PolicyHolder
{
   // Fields
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String holderSmokingStatus;
   private int holderHeight;
   private int holderWeight;
   
   // No-arg constructor
   public PolicyHolder()
   {
      this.holderFirstName = "Bob";
      this.holderLastName = "Ross";
      this.holderAge = 50;
      this.holderSmokingStatus = "non-smoker";
      this.holderHeight = 72;
      this.holderWeight = 200;
   }
   
   // Arg constructor
   public PolicyHolder(String holderFirstName, String holderLastName, int holderAge, String holderSmokingStatus, int holderHeight, int holderWeight)
   {
      this.holderFirstName = holderFirstName;
      this.holderLastName = holderLastName;
      this.holderAge = holderAge;
      this.holderSmokingStatus = holderSmokingStatus;
      this.holderHeight = holderHeight;
      this.holderWeight = holderWeight;  
   }
   
   // Copy constructor
   public PolicyHolder(PolicyHolder obj)
   {
      this.holderFirstName = obj.holderFirstName;
      this.holderLastName = obj.holderLastName;
      this.holderAge = obj.holderAge;
      this.holderSmokingStatus = obj.holderSmokingStatus;
      this.holderHeight = obj.holderHeight;
      this.holderWeight = obj.holderWeight; 
   }
   
   /*
     Set policy holder's first name
     @param holderFirstName String
   */
   public void setHolderFirstName(String holderFirstName)
   {
      this.holderFirstName = holderFirstName;
   }
   
   /*
     Set policy holder's last name
     @param holderLastName String
   */
   public void setHolderLastName(String holderLastName)
   {
      this.holderLastName = holderLastName;
   }
   
   /*
     Set policy holder's age
     @param holderAge integer
   */
   public void setHolderAge(int holderAge)
   {
      this.holderAge = holderAge;
   }
   
   /*
     Set policy holder's smoking status
     Accepts either "smoker" or "non-smoker"
     @param holderSmokingStatus String
   */
   public void setHolderSmokingStatus(String holderSmokingStatus)
   {
      this.holderSmokingStatus = holderSmokingStatus;
   }
   
   /*
     Sets policy holder's height
     @param holderHeight integer height in inches
   */
   public void setHolderHeight(int holderHeight)
   {
      this.holderHeight = holderHeight;
   }
   
   /*
     Sets policy holder's weight
     @param holderWeight integer weight in pounds
   */
   public void setHolderWeight(int holderWeight)
   {
      this.holderWeight = holderWeight;
   }
   
   /*
     Gets policy holder's first name
     @return holderFirstName String
   */
   public String getHolderFirstName()
   {
      return this.holderFirstName;
   }
   
   /*
     Gets policy holder's last name
     @return holderLastName String
   */
   public String getHolderLastName()
   {
      return this.holderLastName;
   }
   
   /*
     Gets policy holder's age
     @return holderAge integer
   */
   public int getHolderAge()
   {
      return this.holderAge;
   }
   
   /*
     Gets policy holder's smoking status
     @return holderSmokingStatus String of either "smoker" or "non-smoker"
   */
   public String getHolderSmokingStatus()
   {
      return this.holderSmokingStatus;
   }
   
   /*
     Gets the holder's height
     @return holderHeight integer in inches
   */
   public int getHolderHeight()
   {
      return this.holderHeight;
   }
   
   /*
     Gets the policy holder's weight
     @return holderWeight integer in pounds
   */
   public int getHolderWeight()
   {
      return this.holderWeight;
   }
   
   /*
     Calculates and returns the BMI of the policyholder
     BMI = (Policyholder’s Weight * 703 ) / (Policyholder’s Height^2 )
     @return holderBMI integer body mass index
   */
   public int calculateHolderBMI()
   {
      int holderBMI = ((this.holderWeight * 703) / (this.holderHeight * this.holderHeight));
      return holderBMI;
   }
   
   /*
     Calculates and returns the price of the insurance policy
     The Insurance Policy has a base fee of $600
     If the Policyholder is over 50 years old, there is an additional fee of $75
     If the Policyholder is a smoker, there is an additional fee of $100
     If the Policyholder has a BMI of over 35, there is an additional fee calculated as follows:
        Additional Fee = ( BMI – 35 ) * 20
     @return policyPrice double representing total policy holder's policy price
   */
   public double calculatePolicyPrice()
   {
      final int BASE_FEE = 600;
      double policyPrice = BASE_FEE;
      
      if (this.holderAge > 50)
      {
         policyPrice += 75;
      }
      
      if (this.holderSmokingStatus.equals("smokes"))
      {
         policyPrice += 100;
      }
      
      int holderBMI = this.calculateHolderBMI();
      if (holderBMI > 35)
      {
         policyPrice += ((holderBMI - 35) * 20);
      }
      
      return policyPrice; 
   }
   
   /*
     toString method
     @return String value output information
   */
   public String toString()
   {
      return ("Policyholder's First Name: " + this.getHolderFirstName() + "\nPolicyholder's Last Name: " + this.getHolderLastName() + 
              "\nPolicyholder's Age: " + this.getHolderAge() + "\nPolicyholder's Smoking Status: " + this.getHolderSmokingStatus() +
              "\nPolicyholder's Height: " + this.getHolderHeight() + "\nPolicyholder's Weight: " + this.getHolderWeight() +
              "\nPolicyholder's BMI: " + this.calculateHolderBMI() + "\nPolicy Price: " + this.calculatePolicyPrice());
   }
     
}