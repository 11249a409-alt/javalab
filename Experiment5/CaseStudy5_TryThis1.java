// Case Study 5: Try This
// Add the current thread's name to the booking output
// using Thread.currentThread().getName().

class TryBookingSeats {
    private int available = 10;

    synchronized void book() {
        String counter = Thread.currentThread().getName();

        if (available > 0) {
            available--;
            System.out.println(
                counter + " booked seat. Left = " + available
            );
        } else {
            System.out.println(counter + " -> HOUSE FULL");
        }
    }
}

class CaseStudy5TryThis1 {
    public static void main(String[] args) {
        TryBookingSeats seats = new TryBookingSeats();

        for (int i = 1; i <= 3; i++) {
            Thread t = new Thread(() -> {
                for (int j = 0; j < 4; j++)
                    seats.book();
            });

            t.setName("Counter-" + i);
            t.start();
        }
    }
}

/*
Output: The order varies between runs.
Counter-1, Counter-2 and Counter-3 identify
the threads making the booking attempts.
Exactly 10 seats can be booked.
*/
