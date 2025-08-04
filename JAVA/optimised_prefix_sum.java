import java.util.Scanner;
public class optimised_prefix_sum {
    public static void main(String[] args) {
    int[] arr;
    int l, r, q, n;
    int[] L, R;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array:");
    n = sc.nextInt();
    arr = new int[n];
        System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();  
    } 
    for (int i = 1; i < n; i++) {
        arr[i] += arr[i - 1];
    }
    System.out.println("Enter the number of queries:");
    q = sc.nextInt();
    L = new int[q];
    R = new int[q];
    System.out.println("Enter the queries (L and R):");
    for (int i = 0; i < q; i++) {
        L[i] = sc.nextInt();
        R[i] = sc.nextInt();
        
    for(int query = 0; query < q; query++) {
        l = L[query];
        r = R[query];
        if (l == 0) {
            System.out.println(arr[r]);
        } else {
            System.out.println(arr[r] - arr[l - 1]);
        }
    }

    
}
    sc.close();
    }
}
