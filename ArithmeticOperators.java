import java.util.Scanner;

public class ArithmeticOperators {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("⚠️ Cannot divide by zero.");
            return 0;
        }
        return (double) a / b;
    }

    public int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArithmeticOperators calculator = new ArithmeticOperators();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Performing operations
        System.out.println("\nResults:");
        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));
        System.out.println("Division: " + calculator.divide(num1, num2));
        System.out.println("Modulus: " + calculator.modulus(num1, num2));
    }
}
