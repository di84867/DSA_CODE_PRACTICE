import java.util.Scanner;

public class CharacterPairCounterOptimised  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String A = sc.nextLine();

        int N = A.length();
        int[] PA = new int[N]; 
        
        PA[0] = 0; 
        for (int i = 1; i < N; i++) {
            PA[i] = PA[i - 1] + (A.charAt(i - 1) == 'a' ? 1 : 0);
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (A.charAt(i) == 'g') {
                count += PA[i]; 
            }
        }

        System.out.println("Number of (a,g) pairs: " + count);
        sc.close();
    }
}

