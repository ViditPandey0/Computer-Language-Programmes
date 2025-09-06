import java.util.Scanner;

public class digitsCount {
    
    public int countDigits(int n){
        int count = 0;
        if(n == 0) {
            count = 1; // Special case for 0
        } else {
            while (n != 0) {
                n /= 10;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        digitsCount dc = new digitsCount();
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        dc.countDigits(number);
        sc.close();
    }
}
