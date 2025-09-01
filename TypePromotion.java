//12. Write a program to demonstrate type promotion in arithmetic operations.

public class TypePromotion {
    public static void main(String[] args) {
        byte b = 10;
        int i = 20;
        double d = 5.5;
        double result = b + i + d; // b and i promoted to double
        System.out.println("Result: " + result);

        // char promotion
        char c = 'A'; // 65
        int sum = c + b; // char promoted to int
        System.out.println("Sum (char + byte): " + sum);
    }
}
