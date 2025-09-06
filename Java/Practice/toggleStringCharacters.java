import java.util.Scanner;

public class toggleStringCharacters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s1 = sc.nextLine();
        StringBuffer s2=new StringBuffer(s1);
        for(int i=0;i<s2.length();i++){
            int ascii = (int) s2.charAt(i);
            if (ascii>=65 && ascii<=91){
                s2.setCharAt(i,(char)(ascii+32));
            }else if(ascii>=97 && ascii<=122){
                s2.setCharAt(i,(char)(ascii-32));
            }
        }
        System.out.println("Toggled string is : " + s2);
        sc.close();
    }
}
