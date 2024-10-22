public class ArrayException {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("The number at index 4 is: " + numbers[4]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
