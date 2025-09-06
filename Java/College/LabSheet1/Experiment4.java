package College.LabSheet1;

import java.scanner.*;
public class Experiment4 {
    public static int findLargest(int a, int b, int c) 
    {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();  
        int c = scanner.nextInt();
        scanner.close();
        int largest = findLargest(a, b, c);
        System.out.println("The largest number is: