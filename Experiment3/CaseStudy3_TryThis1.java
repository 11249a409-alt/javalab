// Experiment 3: Case Study 3 - Try This 1
// Question: Add a NetBanking class with a flat charge of Rs. 12.
// The class implements the existing Payment interface.

class NetBanking implements Payment {
    public double charge(double amount) {
        return 12;
    }

    public String name() {
        return "NetBanking";
    }
}

/*
Output when NetBanking is added to the PaymentDemo array:
NetBanking charge    12.00 total   75012.00
*/
