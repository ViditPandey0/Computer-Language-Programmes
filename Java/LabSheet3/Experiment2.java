package coding.Java.LabSheet3;

import java.util.Scanner;

class Car {
    private String brand;
    private String model;

    // Default constructor
    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
    }

    // Parameterized constructor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

public class Experiment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brand = sc.nextLine();
        String model = sc.nextLine();

        Car car = new Car(brand, model);
        car.display(); // Display car details
        sc.close();
    }
}