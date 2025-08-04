import java.util.Scanner;

public class carryforward{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.print("Enter the first character (x) to find at i (i < j): ");
        char x = scanner.next().charAt(0);

        System.out.print("Enter the second character (y) to find at j (j > i): ");
        char y = scanner.next().charAt(0);

        int countX = 0;       
        int pairCount = 0;   

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == x) {
                countX++;        
            } else if (current == y) {
                pairCount += countX; 
            }
        }

        System.out.println("Number of (" + x + ", " + y + ") pairs: " + pairCount);
        scanner.close();
    }
}
