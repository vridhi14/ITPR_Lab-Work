import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        int total = 0;

        System.out.println("Enter marks of 5 subjects (out of 100):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double percentage = total / 5.0;
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 75) {
            System.out.println("Grade: A+");
        } else if (percentage >= 65) {
            System.out.println("Grade: A");
        } else if (percentage >= 55) {
            System.out.println("Grade: B");
        } else if (percentage >= 45) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}
