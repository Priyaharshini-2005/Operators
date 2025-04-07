import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two boolean conditions using integers (0 = false, 1 = true)
        System.out.print("Enter first condition (1 for true, 0 for false): ");
        boolean a = scanner.nextInt() == 1;

        System.out.print("Enter second condition (1 for true, 0 for false): ");
        boolean b = scanner.nextInt() == 1;

        System.out.println("\nLogical Operations:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Logical AND
        System.out.println("a && b = " + (a && b));
        // Logical OR
        System.out.println("a || b = " + (a || b));
        // Logical NOT
        System.out.println("!a = " + (!a));
        System.out.println("!b = " + (!b));
    }
}

