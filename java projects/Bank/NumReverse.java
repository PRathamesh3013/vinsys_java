package Bank;

public class NumReverse {
    int n;

    public void NumReverse(int num) {
        n = num;
        int rev = 0;
        while (n != 0) {
            
            rev = (n % 10 + rev * 10);
            n = n / 10;
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        NumReverse r1 = new NumReverse();
        r1.NumReverse(12345);
    }
}