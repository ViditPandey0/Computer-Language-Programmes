import java.util.Scanner;

public class copyOneStringToAnotherString {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the source string:");
        String source = scanner.nextLine();
        String destination = source; // Direct assignment copies the reference
        System.out.println("Copied string: " + destination);
        scanner.close();
    }
}
