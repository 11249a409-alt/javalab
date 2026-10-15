// Case Study 5 - Try This: Print the current thread name.
 // Each booking thread uses Thread.currentThread().getName().

class TryThisSeats {
    private int available = 10;

    synchronized void book() {
        String counter = Thread.currentThread().getName();

        if (available > 0) {
            available--;
            System.out.println(counter + " booked seat. Left = " + available);
        } else {
            System.out.println(counter + " -> HOUSE FULL");
        }
    }
}

public class BookingTryThis {
    public static void main(String[] args) {
        TryThisSeats seats = new TryThisSeats();

        for (int i = 1; i <= 3; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 4; j++) {
                    seats.book();
                }
            }, "Counter-" + i);

            thread.start();
        }
    }
}

/*
Sample Output (the order may vary):
Counter-1 booked seat. Left = 9
Counter-2 booked seat. Left = 8
Counter-3 booked seat. Left = 7
Counter-1 booked seat. Left = 6
Counter-2 booked seat. Left = 5
Counter-3 booked seat. Left = 4
Counter-1 booked seat. Left = 3
Counter-2 booked seat. Left = 2
Counter-3 booked seat. Left = 1
Counter-1 booked seat. Left = 0
Counter-2 -> HOUSE FULL
Counter-3 -> HOUSE FULL

The exact counter order may differ, but only 10 seats are booked.
*/
