import java.util.*;

public class firstOccurrenceOfChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println("Enter a character to find its first occurrence:");
        char c =sc.next().charAt(0);
        int index = s.indexOf(c);
        System.out.println("The first occurrence of "+c+" in string "+s+" is "+index);
        sc.close();
    }
}
