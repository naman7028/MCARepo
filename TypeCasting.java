//8. Write a program to demonstrate implicit and explicit type casting.
public class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting (Widening)
        int i = 100;
        double d = i;        // int -> double (implicit)
        System.out.println("Implicit casting (int to double): " + d);

        // Explicit casting (Narrowing)
        double d2 = 123.456;
        int i2 = (int)d2;    // double -> int (explicit)
        System.out.println("Explicit casting (double to int): " + i2);
    }
}
