import java.util.*;


//Write a Java program to take a user’s name and age as input and print them in a single formatted sentence

// class Info {
//     public static void displayUserInfo(String name, int age) {

//         while (true) { 
//             if ((name.length() > 0 && name.length() <= 50)&&(age>=1 && age<=120)) {
//                 System.out.println("Hello " + name + ", you are " + age + " years old.");
//                 break;
//             }else{
//                 System.out.println("Invalid");
//                 break;
//             }
//         }
//     }
// }

// public class lab {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter your name = ");
//         String name = sc.nextLine();

//         System.out.print("Enter your age = ");
//         int age = sc.nextInt();

//         Info.displayUserInfo(name, age);
//         sc.close();
//     }
// }


//Write a Java program that takes two integers and performs the four basic arithmetic operations.
// class Info {
//     public static void performOperations(int a, int b){
//         System.out.println("sum: "+(a+b));
//         System.out.println("Difference: "+(a-b));
//         System.out.println("Product: "+(a*b));

//         if (b!=0){
//             System.out.println("Quotient: "+(a/b));
//         }else{
//             System.out.println("cant divide by zero");
//         }

//     }
// }

// public class lab {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a numberm 1 = ");
//         int a = sc.nextInt();

//         System.out.print("Enter a number 2 = ");
//         int b = sc.nextInt();

//         Info.performOperations(a,b);
//         sc.close();
//     }
// }


//Write a Java program to check whether a given number is even or odd.
// class Info {
//         public static String checkEvenOdd(int a){
//         if (a%2==0){
//             return "even";
//         }else{
//             return "odd";
//         }
//     }
// }

// public class lab {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a numberm 1 = ");
//         int a = sc.nextInt();

//         System.out.println(Info.checkEvenOdd(a));
//         sc.close();
//     }
// }

//Write a Java program to find the largest of three numbers entered by the user.
// class Info {
//     public static int findLargest(int a, int b, int c){
//         if (a>b && a>c){
//             return a;
//         }if (b>a && b>c){
//             return b;
//         }else{
//             return c;
//         }
//     }
// }

// public class lab {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a numberm 1 = ");
//         int a = sc.nextInt();

//         System.out.print("Enter a number 2 = ");
//         int b = sc.nextInt();

//         System.out.print("Enter a number 2 = ");
//         int c = sc.nextInt();

//         System.out.println(Info.findLargest(a,b,c));
//         sc.close();
//     }
// }

//Write a Java program that takes marks of 5 subjects and prints the total, average, and grade based on the 

class Info {
    public static void calculateGrade(int[] marks){

        if (a>b && a>c){
            return a;
        }if (b>a && b>c){
            return b;
        }else{
            return c;
        }
    }
}

public class lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a numberm 1 = ");
        int a = sc.nextInt();

        System.out.print("Enter a number 2 = ");
        int b = sc.nextInt();

        System.out.print("Enter a number 2 = ");
        int c = sc.nextInt();

        System.out.print("Enter a numberm 1 = ");
        int d = sc.nextInt();

        System.out.print("Enter a number 2 = ");
        int e = sc.nextInt();

        int arr[]=[a,b,c,d,e];

        System.out.println(Info.findLargest(a,b,c));
        sc.close();
    }

    
}


