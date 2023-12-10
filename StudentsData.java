import StudentsData.InnerStudentsData;
public class StudentsData {
  public static void main(String[] args) {
    // creating an objects
    //InnerStudentsData students = new InnerStudentsData(1,"prajwal",9.02);
    InnerStudentsData students = new InnerStudentsData();
    // calling the method using dot operator
    students.getData();
    students.showStudentDetails();
  }
}
