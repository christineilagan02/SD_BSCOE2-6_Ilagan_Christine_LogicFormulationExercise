// program #3

import java.util.Scanner;

public class BinaryToDecimalConverter {

    // ANSI escape codes for text color
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BOLD = "\u001B[1m";

    public static void main(String[] args) {
        // Read the number of binary inputs from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print(ANSI_BOLD + "\nEnter the number of binary numbers: " + ANSI_RESET);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading N

        System.out.println(ANSI_BOLD + "\nConversion Results:" + ANSI_RESET);

        // Convert each binary number to decimal and print the result
        for (int i = 0; i < N; i++) {
            String binary = scanner.nextLine();
            int decimal = binaryToDecimal(binary);
            System.out.println(ANSI_YELLOW + "Decimal equivalent: " + decimal + ANSI_RESET);
            System.out.println(ANSI_CYAN + "---------------------------\n" + ANSI_RESET);
        }
    }

    private static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        // Iterate through each binary digit from right to left
        for (int i = binary.length() - 1; i >= 0; i--) {
            char digit = binary.charAt(i);

            // If the digit is '1', add the corresponding power of 2 to the decimal value
            if (digit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
}