// Custom Exception Class
class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        int age = 10;
        try {
            if (age < 18) {
                // Throw custom exception
                throw new AgeException("Age is below 18, not eligible to vote.");
            } else {
                System.out.println("Eligible to vote.");
            }
        } catch (AgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}