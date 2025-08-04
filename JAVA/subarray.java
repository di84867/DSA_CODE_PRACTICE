import java.util.Scanner;

public class subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Generate and print all subarrays
        System.out.println("All subarrays are:");
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                // Print elements from start to end index
                System.out.print("[");
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k]);
                    if (k < end) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            }
        }

        sc.close();
    }
}
