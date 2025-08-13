//Prining row wise sum of 2D mat
    import java.util.Scanner;
public class TwoDmatisum {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows:");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns:");
        int cols = sc.nextInt();    

        int[][] mat = new int[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at index [" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println("\nThe entered matrix is:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }   
        for(int i=0;i<=rows-1;i++){
        int total=0;
        for (int j=0; j<=cols-1;j++){
            total+=mat[i][j];
        }
        System.out.println("The row wise sum of elements is: " + total);
        }
    }
}

