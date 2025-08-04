import java.util.Scanner;
public class sum1ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int total = 0;
        for(int i=1;i<=n;i++) {
            total += i;
        }
        System.out.println("");
        System.out.println("The sum of numbers from 1 to " + n + " is): " + total);
        System.out.println("Total sum of the array elements: " + total);
    sc.close();
    }
}

