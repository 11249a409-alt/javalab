// Experiment 5.2: Multithreading with Synchronization

class SharedCounter {
    private int count = 0;

    synchronized void increment() {
        count++;
    }

    int get() {
        return count;
    }
}

public class Ex5_2_SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        SharedCounter c = new SharedCounter();

        Runnable job = () -> {
            for (int i = 0; i < 10000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(job);
        Thread t2 = new Thread(job);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count = " + c.get());
    }
}

/*
Output:
Final count = 20000

Without synchronized, the final count may be less than 20000
because some increments can be lost in a race condition.
*/
