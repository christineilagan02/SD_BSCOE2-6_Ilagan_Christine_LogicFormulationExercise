// program #2

public class StackBasic {
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
            System.out.println("Stack is full. Cannot push element.");
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed element: " + value);
        }
    }

    // Remove element from top of stack
    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop element.");
        } else {
            int poppedElement = stackArray[top--];
            System.out.println("Popped element: " + poppedElement);
        }
    }

    // Return top of stack
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public static void main(String args[]) {
        StackBasic stack = new StackBasic(3);
        stack.push(1);
        stack.push(2);
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        System.out.println("Top element: " + stack.peek());
    }
}
