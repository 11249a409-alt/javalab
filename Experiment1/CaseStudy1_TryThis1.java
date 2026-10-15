// Case Study 1 - Try This 1: Give a 10% discount for fewer than 26 days
class DiscountBoarder {
    String name;
    int days;

    DiscountBoarder(String name, int days) {
        this.name = name;
        this.days = days;
    }

    double bill() {
        double amount = days * 85.0;

        if (days < 26)
            amount *= 0.90;

        return amount;
    }
}

class CaseStudy1TryThis1 {
    public static void main(String[] args) {
        DiscountBoarder[] boarders = {
            new DiscountBoarder("Aravind", 28),
            new DiscountBoarder("Divya", 30),
            new DiscountBoarder("Karthik", 25)
        };

        double total = 0;

        System.out.printf("%-10s %4s %10s%n", "NAME", "DAYS", "BILL");

        for (DiscountBoarder b : boarders) {
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
Karthik      25    1912.50
Total collection = Rs. 6842.50
*/
