public class BuiltInExceptions {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }
}