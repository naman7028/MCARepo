//4. Write a program to swap two numbers without using a third variable.
public class swapwithoutthird {
    public static void main(String[] args) {
        int a = 55, b = 45;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
