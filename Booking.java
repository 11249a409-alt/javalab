// Experiment 5 Case Study: Thread-safe seat booking

class Seats {
    private int available = 10;

    synchronized void book(String counter) {
        if (available > 0) {
            available--;
            System.out.println(counter + " booked seat. Left = " + available);
        } else {
            System.out.println(counter + " -> HOUSE FULL");
        }
    }
}

public class Booking {
    public static void main(String[] args) {
        Seats seats = new Seats();

        for (int i = 1; i <= 3; i++) {
            final String counter = "Counter-" + i;
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 4; j++) {
                    seats.book(counter);
                }
            });
            thread.start();
        }
    }
}
