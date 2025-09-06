package College.LabSheet1;

import java.util.Scanner;
public class Experiment3 {
    public static String checkEvenOdd(int n) {
        if (n % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        checkEvenOdd(number);
        scanner.close();
    }
}
