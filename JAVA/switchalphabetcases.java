import java.util.Scanner;
public class switchalphabetcases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <=str.length()-1 ; i++) {
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                ch = Character.toUpperCase(ch);
            }
            else if(ch>='A' && ch<='Z'){
                ch = Character.toLowerCase(ch);
            }
            result.append(ch);
        }
        System.out.println("Converted String: " + result.toString());
        sc.close();
    }
}


        