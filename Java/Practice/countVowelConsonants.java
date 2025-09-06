import java.util.Scanner;

public class countVowelConsonants {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to count vowels and consonants:");
        String s=sc.nextLine();
        int vowel=0,consonant=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==('a') || s.charAt(i)==('e') || s.charAt(i)==('i') || s.charAt(i)=='o' || s.charAt(i)=='u'|| s.charAt(i)==('A') || s.charAt(i)==('E') || s.charAt(i)==('I') || s.charAt(i)=='O' || s.charAt(i)=='U' ){
                vowel++;
            }else if ((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z'))
                consonant++;
        }
        System.out.println("In the given string : number of vowels="+vowel+",number of consonants="+consonant);
        sc.close();
    }
}
