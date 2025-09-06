import java.util.Scanner;

public class ToUppercase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.nextLine();
        String lower = s.toLowerCase();
        System.out.println("Lowercase string is : " + lower);
        sc.close();
    }
}
