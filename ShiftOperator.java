import java.util.Scanner;

public class ShiftOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number and number of positions to shift
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.print("Enter number of positions to shift: ");
        int shift = scanner.nextInt();

        // Applying shift operators
        System.out.println("Original number: " + num);
        System.out.println("Left shift (" + num + " << " + shift + "): " + (num << shift));
        System.out.println("Right shift (" + num + " >> " + shift + "): " + (num >> shift));
        System.out.println("Unsigned Right shift (" + num + " >>> " + shift + "): " + (num >>> shift));
    }
}

