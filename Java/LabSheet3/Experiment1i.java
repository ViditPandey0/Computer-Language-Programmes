package coding.Java.LabSheet3;


import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        if (title == null || author == null) {
            throw new IllegalArgumentException("Title and Author cannot be null");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price should be positive");
        }
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Experiment1i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String author = sc.nextLine();
        double price = sc.nextDouble();

        Book book = new Book(title, author, price);
        book.displayDetails();
        sc.close():
    }
}
