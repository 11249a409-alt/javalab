// Case Study 5: Ticket Booking Counter
// Problem: Ten seats are left. Three booking counters
// try to sell them simultaneously.
// Requirements: One shared seat count, three threads,
// a synchronized book() method, and no duplicate sales.

class BookingSeats {
    private int available = 10;

    synchronized void book(String counter) {
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

class CaseStudy5Booking {
    public static void main(String[] args) {
        BookingSeats seats = new BookingSeats();

        for (int i = 1; i <= 3; i++) {
            String name = "Counter-" + i;

            new Thread(() -> {
                for (int j = 0; j < 4; j++)
                    seats.book(name);
            }).start();
        }
    }
}

/*
Output: The order varies between runs.
Exactly 10 seats are booked.
The remaining booking attempts print HOUSE FULL.
The available seat count never becomes negative.
*/
