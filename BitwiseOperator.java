import java.util.Scanner;

public class BitwiseOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        System.out.println("\nBitwise Operations:");
        System.out.println("a = " + a + " (Binary: " + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (Binary: " + Integer.toBinaryString(b) + ")");

        // Bitwise AND
        System.out.println("a & b = " + (a & b));
        // Bitwise OR
        System.out.println("a | b = " + (a | b));
        // Bitwise XOR
        System.out.println("a ^ b = " + (a ^ b));
        // Bitwise Complement
        System.out.println("~a = " + (~a));
        System.out.println("~b = " + (~b));
        // Left Shift
        System.out.println("a << 1 = " + (a << 1)); // Shift left by 1
        // Right Shift
        System.out.println("b >> 1 = " + (b >> 1)); // Shift right by 1
    }
}

