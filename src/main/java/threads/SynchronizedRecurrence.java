package threads;

public class SynchronizedRecurrence {
    public static synchronized void testSynchronizedRecurrency(int counter) {
        System.out.println("OK DA SIE :)");
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counter++;
        System.out.println(counter);

        if (counter <= 5) {
            System.out.println("KONIETZ");
            testSynchronizedRecurrency(counter);
        }
        System.out.println(Thread.currentThread().getId());

    }
    // It is possible to enter recursively to the synchronized function by one thread
    public static void main(String[] args) {
        Thread thread = new Thread(() -> testSynchronizedRecurrency(1));
        thread.start();
    }

}

