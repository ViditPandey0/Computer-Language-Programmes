import java.util.Scanner;
public class p4 {
    public static void main (String[] argu)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int a=sc.nextInt();
        System.out.println("Enter breadth:");
        int b=sc.nextInt();
        int prmt=2*a+2*b;
        System.out.println(prmt);
    }
}
 