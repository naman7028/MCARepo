//6. Write a program to check whether a number is positive, negative, or zero

public class number {
    public static void main(String[] args) {
        int number = -20;
        if (number > 0)
            System.out.println(number + " is positive.");
        else if (number < 0)
            System.out.println(number + " is negative.");
        else
            System.out.println(number + " is zero.");
    }
}
