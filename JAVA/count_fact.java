import java.util.*;
class count_fact{
    public static void main(String[] args) {
        int count=0,i,n;
        System.out.println("Enter a number to find its factors:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("The factors of " + n + " are:");
        for(i=1; i<=n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
                count+=1;
                System.out.println("Count of factors: " + count);
            }
            sc.close();
        }
    }
}