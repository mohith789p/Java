class ArrayInitialization {
    public static void main(String[] args) {

        int[] numbers; // declaration
        numbers = new int[] { 1, 2, 3, 4, 5 }; // intialization

        // Intialization at the time of Declaration
        int[] digits = { 6, 7, 8, 9, 10 };

        for (int number : numbers) {
            System.out.println(number);
        }
        for (int digit : digits) {
            System.out.println(digit);
        }
    }
}
