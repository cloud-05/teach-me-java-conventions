package powerpackage;

public class PowerFinder {
    // Method to calculate power
    public static int calculatePower(int base, int exponent) {
        int result = 1;
        
        // Handle exponent 0 case
        if (exponent == 0) {
            return 1;
        }

        // Loop for multiplication
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}