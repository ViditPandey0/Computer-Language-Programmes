import java.util.Scanner;

public class reverseOrderOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse the order of words:");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        int n = words.length;
        for (int i = 0; i < n / 2; i++) {
            String temp = words[i];
            words[i] = words[n - 1 - i];
            words[n - 1 - i] = temp;
        }
        String reversedStr = String.join(" ", words);
        System.out.println("Reversed order of words: " + reversedStr);
    } 
}
