import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        // Ternary operator to find the greater number
        int max = (a > b) ? a : b;

        System.out.println("The greater number is: " + max);
    }
}

