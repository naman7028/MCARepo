//3. Write a program to swap two numbers using a third variable.
public class swap {
    public static void main(String[] args) {
        int a = 5, b = 10, temp;
        System.out.println("Before swap: a = " + a + ", b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
