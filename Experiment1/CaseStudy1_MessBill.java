// Case Study 1: Hostel Mess Bill
class MessBoarder {
    String name;
    int days;

    MessBoarder(String name, int days) {
        this.name = name;
        this.days = days;
    }

    double bill() {
        return days * 85.0;
    }
}

class MessBill {
    public static void main(String[] args) {
        MessBoarder[] boarders = {
            new MessBoarder("Aravind", 28),
            new MessBoarder("Divya", 30),
            new MessBoarder("Karthik", 25)
        };

        double total = 0;

        System.out.printf("%-10s %4s %10s%n", "NAME", "DAYS", "BILL");

        for (MessBoarder b : boarders) {
            System.out.printf(
                "%-10s %4d %10.2f%n", b.name, b.days, b.bill()
            );
            total += b.bill();
        }

        System.out.printf("Total collection = Rs. %.2f%n", total);
    }
}

/*
Output:
NAME       DAYS       BILL
Aravind      28    2380.00
Divya        30    2550.00
Karthik      25    2125.00
Total collection = Rs. 7055.00
*/
