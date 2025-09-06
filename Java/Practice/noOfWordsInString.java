import java.util.*;

public class noOfWordsInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to count the number of words:");
        String s = sc.nextLine();
        int wordCount = 0;

        // Split the string by whitespace and count the number of elements
        String[] words = s.trim().split(" ");
        wordCount = words.length;

        System.out.println("In the given string, the number of words is: " + wordCount);
        sc.close();
    }
}
