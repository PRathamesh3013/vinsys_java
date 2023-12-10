import java.util.Scanner;

public class Hello_WorldNT {

  static void hello(int n){
    for(int i=0;i<=n-1;i++){
    
      System.out.println("Hello World!");
      }

  }
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    if(n<50){
    hello(n);
    }else{
    System.out.println("we will be done only 0 to 50");  
    }
  }
}