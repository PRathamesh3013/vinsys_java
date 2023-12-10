import java.util.Scanner;

public class EvenOdd {

public static void condition(int num){
    if(num%2==0){
      System.out.println("number is even"+num);
    }
    else{
      System.out.println("number is odd"+num);
    }

  }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     //EvenOdd eo=new EvenOdd();
     System.out.println("Enter no to check even odd condition");
    int num=sc.nextInt();                                                 
    condition(num);
  }
}
