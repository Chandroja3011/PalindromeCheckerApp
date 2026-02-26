public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        PalindromeCheckerApp obj = new PalindromeCheckerApp();

        boolean result = obj.checkPalindrome(input);

        System.out.println("Input " + input);
        System.out.println("Is Palindrome? " + result);
    }

    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}