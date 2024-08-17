public class MultiDArray {
    public static void main(String[] args) {
        int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 } };
        int sum = 0;
        System.out.println("Task 1:");
        for (int[] row : numbers) {
            for (int num : row) {
                System.out.println(num);
            }
        }
        System.out.println();

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Task 2:");
        System.out.println("Sum of Diagonal Elements: " + sum);
    }
}
