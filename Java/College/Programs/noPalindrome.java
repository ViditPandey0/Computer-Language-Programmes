import java.util.Scanner;

public class noPalindrome {
    public static void main(String[] args){
        System.out.print("Enter an integer : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reversed = 0, original = n;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
        sc.close();
    }
}
