//13. Write a program to show the difference between static and instance variables.

class Counter {
    int staticCount = 0; // static variable
    int instanceCount = 0;      // instance variable

    public Counter() {
        staticCount++;
        instanceCount++;
    }
}

public class CounterInstance {
    public static void main(String[] args) {
        Counter a = new Counter();
        Counter b = new Counter();

        System.out.println("a: staticCount = " + a.staticCount + ", instanceCount = " + a.instanceCount);
        System.out.println("b: staticCount = " + b.staticCount + ", instanceCount = " + b.instanceCount);
    }
}
