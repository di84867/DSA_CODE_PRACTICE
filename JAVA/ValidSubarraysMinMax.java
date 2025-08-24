import java.util.Scanner;

public class ValidSubarraysMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter the allowed max-min difference: ");
        int limit = sc.nextInt();

        System.out.println("Valid subarrays:");
        for (int start = 0; start < n; start++) {
            int minVal = arr[start], maxVal = arr[start];
            for (int end = start; end < n; end++) {
                minVal = Math.min(minVal, arr[end]);
                maxVal = Math.max(maxVal, arr[end]);
                if (maxVal - minVal <= limit) {
                    System.out.print("[");
                    for (int i = start; i <= end; i++) {
                        System.out.print(arr[i]);
                        if (i < end) System.out.print(", ");
                    }
                    System.out.println("]");
                }
            }
        }
        sc.close();
    }
}
