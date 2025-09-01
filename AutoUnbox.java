//9. Write a program to demonstrate autoboxing and unboxing.
import java.util.ArrayList;

public class AutoUnbox {
    public static void main(String[] args) {
        // Autoboxing: int to Integer
        Integer obj = 10; // auto-conversion primitive to wrapper

        // Unboxing: Integer to int
        int n = obj; // auto-conversion wrapper to primitive

        System.out.println("Autoboxed Integer: " + obj);
        System.out.println("Unboxed int: " + n);

        // In collections
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20); // autoboxing happens here
        int a = list.get(0); // unboxing
        System.out.println("From list (autobox/unbox): " + a);
    }
}
