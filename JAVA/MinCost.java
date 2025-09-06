import java.util.Scanner;

public class MinCost {

    public static void sortDescending(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] < a[j + 1]) { 
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static int calculateCost(int[] a) {
        int cost = 0;
        for (int i = 0; i < a.length; i++) {
            cost += (i + 1) * a[i];
        }
        return cost;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sortDescending(a);
        int totalCost = calculateCost(a);
        System.out.println("Total cost = " + totalCost);
        sc.close();
    }
}
