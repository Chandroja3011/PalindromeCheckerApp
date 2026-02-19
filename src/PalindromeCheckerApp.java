//uc2
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        String input = sc.nextLine();

        boolean flag = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                flag = false;
                break;
            }
        }

        System.out.println("Is it a Palindrome? : " + flag);
        sc.close();
    }
}

