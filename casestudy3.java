// Case Study 3: Payment Methods

interface Payment {
    double charge(double amount);
    String name();

    default double total(double amount) {
        return amount + charge(amount);
    }
}

class Upi implements Payment {
    public double charge(double a) {
        return 0;
    }

    public String name() {
        return "UPI";
    }
}

class Card implements Payment {
    public double charge(double a) {
        return a * 0.02;
    }

    public String name() {
        return "Card";
    }
}

class Cash implements Payment {
    public double charge(double a) {
        return 20;
    }

    public String name() {
        return "Cash";
    }
}

class NetBanking implements Payment {
    public double charge(double a) {
        return 12;
    }

    public String name() {
        return "NetBanking";
    }
}

public class PaymentDemo {
    public static void main(String[] args) {

        double fee = 75000;

        Payment[] modes = {
            new Upi(),
            new Card(),
            new Cash(),
            new NetBanking()
        };

        for (Payment m : modes) {
            System.out.printf("%-10s charge %8.2f total %10.2f%n",
                    m.name(), m.charge(fee), m.total(fee));
        }
    }
}
output:
UPI        charge     0.00 total   75000.00
Card       charge  1500.00 total   76500.00
Cash       charge    20.00 total   75020.00
NetBanking charge    12.00 total   75012.00
