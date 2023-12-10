package Bank;
import java.util.Scanner;
public class Reverse {
   Scanner sc =new Scanner(System.in);
   int num;
   int reverse=0;
   public void reverse(){
    System.out.println("Enter number to Reverse");
    int num = sc.nextInt();
    while (num != 0) {
      int reminder = num % 10;
      reverse= reverse * 10 + reminder;
      num = num / 10;
    }
    System.out.println(reverse);
   }  
  public static void main(String[] args){
    Reverse r = new Reverse();
    r.reverse();  
  }  
}
