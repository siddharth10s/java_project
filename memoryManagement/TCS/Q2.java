import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();

        // Convert to binary
        String binary = Integer.toBinaryString(num);

        // Find the MSB position
        int msbPosition = binary.length() - 1;

        // Create a mask to toggle all bits from MSB onwards
        int mask = (1 << msbPosition) - 1;

        // Toggle the bits
        int toggledNum = num ^ mask;

        System.out.println("Toggled number: " + toggledNum);
    }
}