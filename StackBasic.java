// program #2

import java.util.Scanner;

public class StackBasic {

    // Color codes for console output
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_CYAN = "\u001B[36m";
    private static final String ANSI_BLUE = "\u001B[34m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED = "\u001B[31m";

    private int maxSize;
    private int top;
    private int[] stackArray;

    // constructor
    public StackBasic(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // initially stack is empty
    }

    // Add element to top of stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println(ANSI_RED + "Stack is full. Cannot push element." + ANSI_RESET);
        } else {
            stackArray[++top] = value;
            System.out.println(ANSI_GREEN + "Pushed element: " + value + ANSI_RESET);
        }
    }

    // Remove element from top of stack
    public void pop() {
        if (top == -1) {
            System.out.println(ANSI_RED + "Stack is empty. Cannot pop element." + ANSI_RESET);
        } else {
            int poppedElement = stackArray[top--];
            System.out.println(ANSI_YELLOW + "Popped element: " + poppedElement + ANSI_RESET);
        }
    }

    // Return top of stack
    public int peek() {
        if (top == -1) {
            System.out.println(ANSI_RED + "Stack is empty." + ANSI_RESET);
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public static void main(String args[]) {
        StackBasic stack = new StackBasic(3);
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the maximum size of the stack: ");
        int maxSize = scanner.nextInt();
        stack = new StackBasic(maxSize);
        scanner.nextLine(); // Consume the newline character

        System.out.println(ANSI_CYAN + "---------------------------");
        System.out.println("Stack Operations:");
        System.out.println("---------------------------" + ANSI_RESET);

        int choice = 0;
        while (choice != 4) {
            System.out.println("1. " + ANSI_BLUE + "Push" + ANSI_RESET);
            System.out.println("2. " + ANSI_BLUE + "Pop" + ANSI_RESET);
            System.out.println("3. " + ANSI_BLUE + "Peek" + ANSI_RESET);
            System.out.println("4. " + ANSI_BLUE + "Exit" + ANSI_RESET);
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int topElement = stack.peek();
                    System.out.println(ANSI_CYAN + "Top element: " + topElement + ANSI_RESET);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println(ANSI_RED + "Invalid choice. Please try again." + ANSI_RESET);
                    break;
            }

            System.out.println(ANSI_CYAN + "\n---------------------------\n" + ANSI_RESET);
        }
    }
}
