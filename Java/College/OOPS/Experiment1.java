package College.LabSheet1.OOPS;

import java.util.Scanner;

class abc{
    
    String name;
    int age;

    void display(String name, int age){
        while (true) { 
            if ((name.length() > 0 && name.length() <= 50)&&(age>=1 && age<=120)) {
                System.out.println("Hello " + name + ", you are " + age + " years old.");
                break;
            }else{
                System.out.println("Invalid");
                break;
            }
        }
    }
}

    class Experiment1{
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        abc x1 = new abc();

        System.out.print("Enter your name: ");
        x1.name = scanner.next();

        System.out.print("Enter your age: ");
        x1.age = scanner.nextInt();
        x1.display(x1.name,x1.age);
        scanner.close();
    }
}