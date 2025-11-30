import java.util.*;

// Custom exception for invalid age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class VotingCheck {
    public static void main(String[] args) throws InvalidAgeException{
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        // Check if age is less than 18 and throw exception if true
        if (age < 18) {
            // Throw custom exception for invalid age
            throw new InvalidAgeException("Age must be at least 18 to vote.");
        } else {
            // If age is valid, print eligibility message
            System.out.println("You are eligible to vote.");
        }
    }
    
}
