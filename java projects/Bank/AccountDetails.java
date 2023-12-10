package Bank;
import java.util.Scanner;


public class AccountDetails {
  
  int accNumber;
  String accHolderName;
  int accBalance;
  Scanner sc= new Scanner(System.in);
  public AccountDetails(){
    System.out.println("Enter Account Number : ");
    accNumber=sc.nextInt();
    System.out.println("Enter Account Holder Name : ");
    accHolderName=sc.next();
    System.out.println("Enter Account Balance : ");
    accBalance=sc.nextInt();
    System.out.println("Account Number : "+ accNumber);
    System.out.println("Account Holder Name : "+accHolderName);
    System.out.println("Account Balence : "+accBalance);
  }

  public void deposit(){
    int amount;
    System.out.println("Enter amount to credit in your account : ");
    amount=sc.nextInt();
    accBalance=accBalance+amount;
    System.out.println("In your account Rs "+amount+"credited. Your Account Balance : "+accBalance);
  }
  
  public void debit(){
    int amount;
    System.out.println("Enter amount to debit in your account : ");
    amount=sc.nextInt();
    if(accBalance>=amount){
    accBalance=accBalance-amount;
    System.out.println("In your account Rs "+amount+" debited. Your Account Balance : "+accBalance);
   }else{
    System.out.println("Insufficient Balance");
   }
  }
  public static void main(String[] args) {
    AccountDetails ad = new AccountDetails();
    ad.deposit();
    ad.debit();    
  }
  
}