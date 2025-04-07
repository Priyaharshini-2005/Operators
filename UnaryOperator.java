import java.util.Scanner;

public class UnaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Unary operators
        System.out.println("Original number: " + num);
        System.out.println("Unary minus: " + (-num));
        System.out.println("Pre-increment: " + (++num)); // increases first, then prints
        System.out.println("Post-increment: " + (num++)); // prints first, then increases
        System.out.println("After Post-increment value: " + num);
        System.out.println("Pre-decrement: " + (--num)); // decreases first, then prints
        System.out.println("Post-decrement: " + (num--)); // prints first, then decreases
        System.out.println("After Post-decrement value: " + num);
        System.out.println("Logical NOT (for boolean true): " + (!true));
    }
}
