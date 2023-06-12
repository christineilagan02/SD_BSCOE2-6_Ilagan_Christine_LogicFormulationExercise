import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {

    // Color codes for console output
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading N

        System.out.println(ANSI_CYAN + "Parenthesis Checking Results:" + ANSI_RESET);

        for (int i = 0; i < N; i++) {
            String parentheses = scanner.nextLine();
            if (isBalanced(parentheses)) {
                System.out.println(formatResult(parentheses, ANSI_GREEN + "BALANCED" + ANSI_RESET));
            } else {
                System.out.println(formatResult(parentheses, ANSI_RED + "NOT BALANCED" + ANSI_RESET));
            }
        }
    }

    private static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<>();

        for (char ch : parentheses.toCharArray()) {
            if (ch == '(' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}