import java.util.Scanner;

public class DiagAntiDiagMatrix {

    static void printDiagonal(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int r = 0, c = 0;
        while (r < n && c < m) {
            System.out.print(mat[r][c] + " ");
            r++;
            c++;
        }
        System.out.println();
    }

    static void printAntiDiagonal(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int r = 0, c = m - 1;
        while (r < n && c >= 0) {
            System.out.print(mat[r][c] + " ");
            r++;
            c--;
        }
        System.out.println();
    }

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

        // Print Original Matrix
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Print main diagonal elements
        System.out.println("\nMain Diagonal Elements:");
        printDiagonal(matrix);

        // Print anti-diagonal elements
        System.out.println("Anti-Diagonal Elements:");
        printAntiDiagonal(matrix);

        scanner.close();
    }
}
