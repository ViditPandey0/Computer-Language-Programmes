("Grade: " + grade);
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
