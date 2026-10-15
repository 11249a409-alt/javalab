// Experiment 5(a): Creating Threads
// Demonstrates extending Thread and implementing Runnable.

class First extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++)
            System.out.println("Thread A : " + i);
    }
}

class Second implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++)
            System.out.println("Thread B : " + i);
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        First a = new First();
        Thread b = new Thread(new Second());

        a.start();
        b.start();
    }
}

/*
Sample output (the order can vary):
Thread A : 1
Thread B : 1
Thread A : 2
Thread B : 2
Thread B : 3
Thread A : 3
*/
