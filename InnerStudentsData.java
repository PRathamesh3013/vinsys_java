public class InnerStudentsData {
  int rNo;
  String name;
  double cgpa;
  // constructor for object creation
  public InnerStudentsData(int roll,String nm,double CGPA){
    
    System.out.println("Enter Roll Number");
    this.rNo=roll;
    System.out.println("Enter Name");
    this.name=nm;
    System.out.println("Enter CGPA");
    this.cgpa=CGPA;
  
 }
// method to display the data of student
  public void showStudentDetails(){
  System.out.println("\nRoll No : "+this.rNo);
  System.out.println("Name : "+this.name);
  System.out.println("CGPA : "+this.cgpa+"\n");
  }
}