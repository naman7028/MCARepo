//7. Write a program to print default values of instance variables in a class.

public class instance {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bl;

    public static void main(String[] args) {
        instance obj = new instance();
        System.out.println("Default byte: " + obj.b);
        System.out.println("Default short: " + obj.s);
        System.out.println("Default int: " + obj.i);
        System.out.println("Default long: " + obj.l);
        System.out.println("Default float: " + obj.f);
        System.out.println("Default double: " + obj.d);
        System.out.println("Default char: " + obj.c);
        System.out.println("Default boolean: " + obj.bl);
    }
}