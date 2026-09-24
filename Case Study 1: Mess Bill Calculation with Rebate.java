// Case Study 1: Mess Bill Using an Array of Objects
// Rebate: 10% discount if days are less than 26

class Boarder {
    String name;
    int days;

    Boarder(String n, int d) {
        name = n;
        days = d;
    }

    double bill() {
        double amount = days * 85.0;

        if (days < 26)
            amount = amount - (amount * 0.10);

        return amount;
    }
}

public class MessBill {
    public static void main(String[] args) {

        Boarder[] list = {
            new Boarder("Aravind", 28),
            new Boarder("Divya", 30),
            new Boarder("Karthik", 25)
        };

        double total = 0;

        System.out.println("NAME DAYS BILL");

        for (Boarder b : list) {
            System.out.printf("%-10s %4d %8.2f%n",
                    b.name, b.days, b.bill());

            total = total + b.bill();
        }

        System.out.printf("Total collection = Rs. %.2f%n", total);
    }
}

/*
OUTPUT:

NAME DAYS BILL
Aravind      28  2380.00
Divya        30  2550.00
Karthik      25  1912.50
Total collection = Rs. 6842.50
*/
