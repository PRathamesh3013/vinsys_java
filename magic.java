import java.util.Scanner;

public class magic {
  
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int myNumber=sc.nextInt();
    //document this
    int magicNumber=myNumber*myNumber;
    magicNumber= magicNumber+myNumber;
    magicNumber= magicNumber/myNumber;
    magicNumber= magicNumber+17;
    magicNumber= magicNumber-myNumber;
    magicNumber= magicNumber/6;
    System.out.println(magicNumber);
      
  
  }
  
  
}
