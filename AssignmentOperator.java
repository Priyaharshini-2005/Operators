
    import java.util.Scanner;

    public class AssignmentOperator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input from user
            System.out.print("Enter an initial value: ");
            int a = scanner.nextInt();

            System.out.println("\nOriginal value of a: " + a);

            // Basic assignment
            int b = a;
            System.out.println("Assigned b = a: " + b);

            // Add and assign
            a += 5;
            System.out.println("After a += 5: " + a);

            // Subtract and assign
            a -= 3;
            System.out.println("After a -= 3: " + a);

            // Multiply and assign
            a *= 2;
            System.out.println("After a *= 2: " + a);

            // Divide and assign
            a /= 4;
            System.out.println("After a /= 4: " + a);

            // Modulus and assign
            a %= 3;
            System.out.println("After a %= 3: " + a);
        }
    }


