package College.LabSheet1;

import java.util.Scanner;

public class Experiment5 {
    public static void calculateGrade(int[] marks){
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        double average = total / 5.0;
        String grade;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 75 && average < 90) {
            grade = "B";
        } else if (average >= 60 && average < 75) {
            grade = "C";
        } else if (average >= 40 && average < 60) {
            grade = "D";
        } else {
            grade = "Fail";
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    } 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            marks[i] = scanner.nextInt();
        }
        calculateGrade(marks);
        scanner.close();
    }
}
