//20. Write a program to declare a volatile variable and explain its use in multithreading.

public class Volatile {
    private volatile boolean flag = false;

    public void setFlagTrue() {
        flag = true;
    }

    public void waitForFlag() {
        while (!flag) {
            // Busy-wait until flag is true (flag read always reflects latest value)
        }
        System.out.println("Flag changed by another thread!");
    }

    public static void main(String[] args) throws InterruptedException {
        Volatile demo = new Volatile();

        Thread t1 = new Thread(() -> {
            try { Thread.sleep(1000); } catch (Exception e) {}
            demo.setFlagTrue();
            System.out.println("Flag set to true by thread 1");
        });

        Thread t2 = new Thread(() -> demo.waitForFlag());

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}