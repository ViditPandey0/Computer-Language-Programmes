import java.util.Scanner;

public class reverseOfString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        System.out.println("The reverse of the given string is: " + sb);
        sc.close();
    }
}
