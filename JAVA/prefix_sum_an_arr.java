import java.util.Scanner;
class prefix_sum_an_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        
        System.out.println("Prefix Sum Array:");
        for (int sum : prefixSum) {
            System.out.print(sum + " ");
        }
        sc.close();
    }
}