//17. Write a program to use var (Java 10+) for type inference.

public class Var {
    public static void main(String[] args) {
        var number = 100;                         // int inferred
        var message = "Hello Java10";             // String inferred
        var list = java.util.List.of(1, 2, 3);    // List<Integer> inferred
        System.out.println(number);
        System.out.println(message);
        System.out.println(list);
    }
}

