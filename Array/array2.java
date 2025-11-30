import java.util.*;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
        }
        double average = sum / 10.0;
        System.out.println("Average: " + average);

    }
}
