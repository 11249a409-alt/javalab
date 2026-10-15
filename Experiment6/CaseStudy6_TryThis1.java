// Case Study 6: Try This
// Catch InvalidAmountException and LowBalanceException separately.

class TryInvalidAmountException extends Exception {
    TryInvalidAmountException(String m) {
        super(m);
    }
}

class TryLowBalanceException extends Exception {
    TryLowBalanceException(String m) {
        super(m);
    }
}

class TryAtm {
    static double balance = 5000;

    static void withdraw(double amt)
            throws TryInvalidAmountException,
                   TryLowBalanceException {

        if (amt % 100 != 0)
            throw new TryInvalidAmountException(
                "Amount must be a multiple of 100"
            );

        if (amt > balance)
            throw new TryLowBalanceException(
                "Insufficient balance"
            );

        balance -= amt;

        System.out.println(
            "Dispensed " + amt + ", balance " + balance
        );
    }
}

class CaseStudy6TryThis1 {
    public static void main(String[] args) {
        double[] tries = {2000, 350, 9000, 1500};

        for (double amt : tries) {
            try {
                TryAtm.withdraw(amt);
            } catch (TryInvalidAmountException e) {
                System.out.println("Invalid amount : " + e.getMessage());
            } catch (TryLowBalanceException e) {
                System.out.println("Withdrawal refused : " + e.getMessage());
            }
        }
    }
}

/*
Output:
Dispensed 2000.0, balance 3000.0
Invalid amount : Amount must be a multiple of 100
Withdrawal refused : Insufficient balance
Dispensed 1500.0, balance 1500.0
*/
