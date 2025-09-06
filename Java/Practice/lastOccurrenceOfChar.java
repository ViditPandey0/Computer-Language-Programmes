import java.util.Scanner;

// public class lastOccurrenceOfChar {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string:");
//         String s = sc.nextLine();
//         System.out.println("Enter a character to find its last occurrence:");
//         char c =sc.next().charAt(0);
//         int index = s.lastIndexOf(c);
//         System.out.println("The last occurrence of "+c+" in string "+s+" is "+index);
//         sc.close();
//     }
// }

public class lastOccurrenceOfChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        System.out.println("Enter a character to find its last occurrence:");
        char c =sc.next().charAt(0);
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        String reverse =sb.toString();
        int index = reverse.indexOf(c);
        if (index!=-1){
            index = s.length() - 1 - index; // Convert to original string index        
        }
        System.out.println("The last occurrence of "+c+" in string "+s+" is "+index);
        sc.close();
    }
}
