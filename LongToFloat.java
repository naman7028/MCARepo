//19. Write a program to check if a long value can be stored in a float variable and display the result.

public class LongToFloat {
    public static void main(String[] args) {
        long bigValue = 123456789123456789L;
        float f = bigValue;

        System.out.println("Original long: " + bigValue);
        System.out.println("Stored in float: " + f);

        // Display if long fits in float exactly
        if (bigValue == (long)f) {
            System.out.println("Long can be stored in float exactly.");
        } else {
            System.out.println("Long cannot be stored in float exactly (possible loss of precision).");
        }
    }
}
