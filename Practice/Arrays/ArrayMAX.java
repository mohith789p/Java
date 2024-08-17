class ArrayMAX {
    public static void main(String[] args) {
        int[] numbers = { 60, 90, 20, 80, 30, 70, 50, 10 };
        int Max = numbers[0], Min = numbers[0];
        for (int number : numbers) {
            if (number > Max) {
                Max = number;
            }
            if (number < Min) {
                Min = number;
            }
        }
        System.out.println("MAXIMUM: " + Max);
        System.out.println("MINIMUM: " + Min);

    }
}
