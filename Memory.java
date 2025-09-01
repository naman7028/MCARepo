//15. Write a program to show memory allocation difference between primitive and reference variables.

public class Memory {
    public static void main(String[] args) {
        int a = 5;                   // Primitive stored directly on stack
        int b = a;                   // Copy of value, independent
        b = 10;

        int[] arr = {1, 2, 3};       // Reference stored on stack, object on heap
        int[] arr2 = arr;            // Both point to same array on heap
        arr2[0] = 100;

        System.out.println("Primitive a: " + a);         
        System.out.println("Primitive b: " + b);         
        System.out.println("arr[0]: " + arr[0]);         
        System.out.println("arr2[0]: " + arr2[0]);       
    }
}
