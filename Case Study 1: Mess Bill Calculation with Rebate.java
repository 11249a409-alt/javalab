import java.util.Scanner;

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

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Boarder[] list = new Boarder[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter number of days: ");
            int days = sc.nextInt();

            list[i] = new Boarder(name, days);
        }

        double total = 0;
        Boarder highest = list[0];

        System.out.println("\nNAME DAYS BILL");

        for (Boarder b : list) {
            System.out.printf("%-10s %4d %8.2f%n",
                    b.name, b.days, b.bill());

            total = total + b.bill();

            if (b.bill() > highest.bill())
                highest = b;
        }

        System.out.printf("Total collection = Rs. %.2f%n", total);

        System.out.printf("Highest Bill = %s (Rs. %.2f)%n",
                highest.name, highest.bill());

        sc.close();
    }
}

/*
OUTPUT:

Enter number of students: 3
Enter name: Aravind
Enter number of days: 28
Enter name: Divya
Enter number of days: 30
Enter name: Karthik
Enter number of days: 25

NAME DAYS BILL
Aravind      28  2380.00
Divya        30  2550.00
Karthik      25  1912.50
Total collection = Rs. 6842.50
Highest Bill = Divya (Rs. 2550.00)
*/
