import java.util.*;

public class stringPalindromeOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String s = sc.nextLine();;
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        if (s.toLowerCase().equals(sb.toString().toLowerCase())) {
            System.out.println("The given string is a palindrome");
        } else {
            System.out.println("The given string is not a palindrome");
        }
        sc.close();
    }
}
