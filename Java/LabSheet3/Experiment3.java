package coding.Java.LabSheet3;

class MathOperation {
    public int add(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Integers must be non-negative");
        }
        return a + b;
    }

    public int add(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Integers must be non-negative");
        }
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Experiment3 {
    public static void main(String[] args) {
        MathOperation mo = new MathOperation();

        System.out.println(mo.add(5, 10));      // Output: 15
        System.out.println(mo.add(5, 10, 15));  // Output: 30
        System.out.println(mo.add(5.5, 4.5));   // Output: 10.0
    }
}