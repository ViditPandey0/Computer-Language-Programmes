import java.util.Scanner;

public class stringConcatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String result = str1 + str2; // Using + operator
        System.out.println("Using + operator: " + result);
        
        String result2 = str1.concat(str2); // Using concat() method
        System.out.println("Using concat() method: " + result2);
        sc.close();
    }
}
