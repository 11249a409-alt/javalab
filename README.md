# Java Programming Lab — Experiment 5

This experiment demonstrates multithreading and synchronization in Java.

## Program 5.1 — ThreadDemo.java

**Concepts:** Creating a thread by extending `Thread` and implementing `Runnable`.

Run:
```bash
javac ThreadDemo.java
java ThreadDemo
```

Sample output (the order may vary because both threads run concurrently):
```text
Thread A: 1
Thread A: 2
Thread B: 1
Thread A: 3
Thread B: 2
Thread B: 3
```

## Program 5.2 — SyncDemo.java

**Concepts:** Synchronization, shared data, and `join()`.

Run:
```bash
javac SyncDemo.java
java SyncDemo
```

Output:
```text
Final count = 20000
```

## Case Study — Booking.java

**Concepts:** Synchronization to prevent multiple threads from booking the same available seat.

Run:
```bash
javac Booking.java
java Booking
```

The program starts three counters, each attempting four bookings. Since there are only 10 seats, exactly 10 booking attempts succeed and the remaining 2 print `HOUSE FULL`. The order of messages may vary between runs.
