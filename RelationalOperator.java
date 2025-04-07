import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        System.out.println("\nRelational Operations:");
        System.out.println("a = " + a + ", b = " + b);

        System.out.println("a == b : " + (a == b)); // equal to
        System.out.println("a != b : " + (a != b)); // not equal to
        System.out.println("a > b  : " + (a > b));  // greater than
        System.out.println("a < b  : " + (a < b));  // less than
        System.out.println("a >= b : " + (a >= b)); // greater than or equal to
        System.out.println("a <= b : " + (a <= b)); // less than or equal to
    }
}

