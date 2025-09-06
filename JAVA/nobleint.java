import java.util.Scanner;
public class nobleint {
    public static void main(String[] args) {
        int n;
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    count++;
                }
            }
            if (count == arr[i]) {
                found = true;
                System.out.println("Noble integer found: " + arr[i]);
                break;
            }
        }

        if (!found) {
            System.out.println("No noble integer found.");
        }
    }
}
