import java.util.*;

public class strComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings to compare:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int result =str1.compareTo(str2);
        if(result==0){
            System.out.println("Both strings are equal.");
        }
        else if(result<0){
            System.out.println( str1  + " is less than "  + str2 );
        }
        else{
            System.out.println(str1 + " is greater than " + str2 );
        }
        sc.close();
    }
}
