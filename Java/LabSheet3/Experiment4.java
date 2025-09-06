package coding.Java.LabSheet3;

import java.util.Scanner;

class Student {
    private String name;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks should be between 0 and 100");
        }
        this.marks = marks;
    }
}

public class Experiment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Marks: ");
        int marks = sc.nextInt();

        s.setName(name);
        s.setMarks(marks);

        System.out.println("Name: " + s.getName());
        System.out.println("Marks: " + s.getMarks());
        sc.close();
    }
}