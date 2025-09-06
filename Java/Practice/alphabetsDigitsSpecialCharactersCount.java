import java.util.*;

public class alphabetsDigitsSpecialCharactersCount {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        int alpha=0,digits=0,schar=0;
        for (int i=0;i<=s.length()-1;i++){
            if ((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z')){
                alpha++;
            }else if (s.charAt(i)>='0' && s.charAt(i)<='9'){
                digits++;
            }else{
                schar++;
            }
        }
        System.out.println("In the given string : number of alphabets="+alpha+",number of digits="+digits+",number of special characters="+schar);
        sc.close();
    }
}
