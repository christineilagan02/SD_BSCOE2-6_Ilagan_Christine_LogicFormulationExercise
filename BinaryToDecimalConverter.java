// program #3

import java.util.Scanner;

public class BinaryToDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading N

        for (int i = 0; i < N; i++) {
            String binary = scanner.nextLine();
            int decimal = binaryToDecimal(binary);
            System.out.println(decimal);
        }
    }

    private static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            char digit = binary.charAt(i);
            if (digit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
}