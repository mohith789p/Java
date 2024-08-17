class ArraySum {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        double avg;
        for (int number : numbers) {
            sum = sum + number;
        }
        avg = sum / 10.0;
        System.out.println("SUM: " + sum);
        System.out.println("AVERAGE: " + avg);

    }
}
