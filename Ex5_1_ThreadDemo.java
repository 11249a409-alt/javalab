// Experiment 5.1: Creating Threads using Thread and Runnable

class FirstThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread A : " + i);
        }
    }
}

class SecondThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread B : " + i);
        }
    }
}

public class Ex5_1_ThreadDemo {
    public static void main(String[] args) {
        FirstThread a = new FirstThread();
        Thread b = new Thread(new SecondThread());

        a.start();
        b.start();
    }
}

/*
Sample Output (the order may differ each run):
Thread A : 1
Thread B : 1
Thread A : 2
Thread B : 2
Thread B : 3
Thread A : 3

Threads may run in a different order because they execute concurrently.
*/
