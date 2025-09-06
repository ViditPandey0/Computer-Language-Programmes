package coding.Java.LabSheet3;

import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be greater than 0");
        }
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary must be positive");
        }
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Experiment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        String name = sc.nextLine();
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);

        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        sc.close();
    }
}