package StudentsData;

import java.util.Scanner;

public class InnerStudentsData {
  int rNo;
  String name;
  double cgpa;
  // constructor for object creation
  /*public InnerStudentsData(int roll,String nm,double CGPA){
    
    System.out.println("Enter Roll Number");
    this.rNo=roll;
    System.out.println("Enter Name");
    this.name=nm;
    System.out.println("Enter CGPA");
    this.cgpa=CGPA;
  
 }*/
 public void getData(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Roll Number: ");
  this.rNo =sc.nextInt();
  System.out.println("Enter Name: ");
  this.name =sc.next();
  System.out.println("Enter CGPA: ");
  this.cgpa =sc.nextDouble();
 }
// method to display the data of student
  public void showStudentDetails(){
  System.out.println("\nRoll No : "+this.rNo);
  System.out.println("Name : "+this.name);
  System.out.println("CGPA : "+this.cgpa+"\n");
  }
}