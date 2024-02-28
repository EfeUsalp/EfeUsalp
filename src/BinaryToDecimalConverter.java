import java.util.Scanner;

public class BinaryToDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input binary number from the user
        System.out.print("Enter a binary number: ");
        String binaryInput = scanner.nextLine();
        
        // Convert binary to decimal
        int decimalResult = binaryToDecimal(binaryInput);
        
        // Display the result
        System.out.println("Decimal equivalent: " + decimalResult);
    }

    private static int binaryToDecimal(String binary) {
        int decimal = 0;
        int binaryLength = binary.length();

        for (int i = 0; i < binaryLength; i++) {
            int digit = binary.charAt(i) - '0';
            int power = binaryLength - i - 1;
            decimal += digit * Math.pow(2, power);
        }

        return decimal;
    }
}
