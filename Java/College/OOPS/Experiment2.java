package College.LabSheet1.OOPS;

import java.util.Scanner;

public class Experiment2 {

    public static void performOperations(int a, int b) {
        // Sum
        System.out.println("Sum: " + (a + b));

        // Difference
        System.out.println("Difference: " + (a - b));

        // Product
        System.out.println("Product: " + (a * b));

        // Quotient with division by zero handling
        if (b != 0) {
            System.out.println("Quotient: " + (a / b));
        } else {
            System.out.println("Quotient: Error! Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Call the function
        performOperations(a, b);

        scanner.close();
    }
}
