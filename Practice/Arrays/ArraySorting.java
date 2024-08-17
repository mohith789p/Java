class ArraySorting {
    public static void main(String[] args) {
        int[] numbers = { 87, 45, 99, 15, 64 };
        int i, j, temp;
        for (i = 0; i < numbers.length - 1; i++) {
            for (j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}