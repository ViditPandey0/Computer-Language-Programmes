package College.LabSheet1;


import java.util.Scanner;

public class Experiment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object for input

        // Prompt and read user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt and read user's age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Output formatted sentence
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close(); // Close the scanner
    }
}