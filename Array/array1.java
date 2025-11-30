import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Even Numbers in the array are: ");
        for (int i = 0; i < 20; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }


    }
    
}
