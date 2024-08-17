class ArrayReverse {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int len = numbers.length;
        int i, j, temp;;
        for (i = 0, j = len - 1; i < j; i++, j--) {
            temp = numbers[i]; 
           numbers[i] = numbers[j];
            numbers[j] = temp;
         }
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
