//18. Write a program to demonstrate numeric overflow in Java

public class Overflow {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        System.out.println("Max int: " + max);
        int result = max + 1;
        System.out.println("After overflow: " + result); 
    }
}

