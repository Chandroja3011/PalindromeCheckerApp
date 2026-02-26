interface PalindromeStrategy {
    boolean check(String input);
}

class SimpleStrategy implements PalindromeStrategy {

    public boolean check(String input) {

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

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Level";

        PalindromeStrategy strategy = new SimpleStrategy();

        long startTime = System.nanoTime();

        boolean result = strategy.check(input.toLowerCase());

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Input " + input);
        System.out.println("Is Palindrome?: " + result);
        System.out.println("ExecutionTime: " + executionTime);
    }
}