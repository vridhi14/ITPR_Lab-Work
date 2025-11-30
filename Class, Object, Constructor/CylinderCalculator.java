import java.util.Scanner;

public class CylinderCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input radius and height
        System.out.print("Enter radius of the cylinder: ");
        double r = sc.nextDouble();

        System.out.print("Enter height of the cylinder: ");
        double h = sc.nextDouble();

        // Calculations
        double csa = 2 * Math.PI * r * h;         // Curved Surface Area
        double tsa = 2 * Math.PI * r * (r + h);   // Total Surface Area
        double volume = Math.PI * r * r * h;      // Volume

        // Output
        System.out.println("\nCylinder Calculations:");
        System.out.printf("Curved Surface Area = %.2f square units%n", csa);
        System.out.printf("Total Surface Area  = %.2f square units%n", tsa);
        System.out.printf("Volume              = %.2f cubic units%n", volume);

        sc.close();
    }
}
