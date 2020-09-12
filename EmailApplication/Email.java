package EmailApplication;

import java.util.Scanner;

public class Email {

   private String firstName;
   private String lastName;
   private String password;
   private String department;
   private int mailBosCapacity = 500;
   private String email;
   private String alternateEmail;
   private String companySuffix = "injs.com";

   //Construction to receive the first name and last name
   public Email(){

   }

   public Email(String firstName, String lastName) {
       this.firstName = firstName;
       this.lastName = lastName;
       //Call a methode asking for the department - return the department
       this.department = setDepartment();
       //Call method that returns a random password
       this.password = randomPassword(9);
       System.out.println("your first :"  + firstName +" and your last Name is: " + lastName);
       System.out.println("Department :"+ this.department);
       System.out.println("Your random password is :" + password);

       //Combine elements to generate email
       email  = firstName.toLowerCase()+lastName.toLowerCase() + "@"+ department + "." + companySuffix;
      
   }
   
   //Ask for the Department
   private String setDepartment(){
       System.out.println("Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\no for none");
       Scanner kScanner = new Scanner(System.in);
       System.out.print("Enter a choosen code: ");
       int enter = kScanner.nextInt();
       if(enter == 1) return "Sales";
       else if (enter == 2) return "Dev";
       else if (enter == 3) return "Acct";
       else return " ";
   }
   //Generate a random password
   private String randomPassword(int length){
       String passwordSet = "YJUIKDJWNLWOIOKLELRNCNNNCNNKJ@HJ!PP*";
       char[] password = new char[length];
       for(int i=0; i<length; i++){
           int rand = (int)(Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand); 
       }
       return new String(password);
   }
   //Set the mailbox Capacity
   public void setMailbocCapacity(int capacity){
       this.mailBosCapacity = capacity;
   }
   //Set the alternate email
   public void setAlternateEmail(String altEmail){
       this.alternateEmail = altEmail;
   }
   //Change the password
   public void changePassword(String pass){
       this.password = pass;
   }

   public int getMailboxCapacity(){ return mailBosCapacity;}
   public String getAlternateEmail(){return alternateEmail;}
   public String getPassword(){return password;}

   public String toString(){
       return "\n DISPLAY NAME: " + firstName +", "+ lastName+ "\n"+
                "COMPANY EMAIL: "+ email +"\n"+
                "MAILBOXCAPACITY: " + mailBosCapacity + "Magabit";
   }
    
}
