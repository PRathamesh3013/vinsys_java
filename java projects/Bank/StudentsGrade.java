package Bank;

import java.util.Scanner;

public class StudentsGrade {
  
  String sName;
  int r_No;
  float percentage;
  Scanner sc = new Scanner(System.in);
  public StudentsGrade(){
    System.out.println("Enter Name Of Student : ");
    sName= sc.next();
    System.out.println("Enter Roll Number of Student : ");
    r_No=sc.nextInt();
    System.out.println("Enter Percentage Of Student : ");
    percentage=sc.nextFloat();
    System.out.println("Name Of Student : "+ sName);
    System.out.println("Roll Number Of Student : "+ r_No);
    System.out.println("Percentage of Student : "+ percentage);
  }
  public void checkGrade(){
    if( percentage>=70){
      System.out.println("Passed with Distinction");
    }else if(percentage>=60){
     System.out.println("Passed with First Class"); 
    }else if(percentage>=50){
     System.out.println("Passed with Second Class");
    }else if(percentage>=40){
      System.out.println("Passed With Pass Class");
    }else{
      System.out.println("Fail");
    }
  }
  public static void main(String[] args) {
   StudentsGrade sg =new StudentsGrade();
   sg.checkGrade(); 
  }

}
