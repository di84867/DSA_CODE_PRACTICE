import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);

        System.out.println("\nTranspose Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[j][i] + "\t"); // swap rows and columns
            }
            System.out.println();
        }

        scanner.close();
    }

    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) { // row gets each row in mat
            for (int val : row) {  // val gets each value in the current row
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
