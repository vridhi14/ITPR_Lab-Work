import java.util.*;

// Custom exception for invalid rectangle dimensions
class InvalidDimensionException extends Exception {
    public InvalidDimensionException(String message) {
        super(message);
    }
}
public class RectangleTest {
    public static void main(String[] args) throws InvalidDimensionException {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble(); // Read length input
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble(); // Read breadth input

        // Validate dimensions
        if (length <= 0 || breadth <= 0) {
            // Throw custom exception for invalid dimensions
            throw new InvalidDimensionException("Length and breadth must be positive numbers.");
        }
        // If dimensions are valid, calculate area and perimeter
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);

        // Calculate perimeter
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
    
}
