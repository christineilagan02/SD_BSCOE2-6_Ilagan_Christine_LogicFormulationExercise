import java.util.*;

public class ParenthesisChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading N

        for (int i = 0; i < N; i++) {
            String parentheses = scanner.nextLine();
            if (isBalanced(parentheses)) {
                System.out.println("BALANCED");
            } else {
                System.out.println("NOT BALANCED");
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