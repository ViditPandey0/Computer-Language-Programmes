import java.util.Scanner;

public class string_length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=scanner.nextLine();
        System.out.println(s.length());
        scanner.close();
    }
}
