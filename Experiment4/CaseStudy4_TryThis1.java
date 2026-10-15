// Experiment 4: Case Study 4 - Try This 1
// Question: Add a Driver who receives basic salary plus Rs. 3000 overtime.

abstract class TryEmp {
    String name;
    double basic;

    TryEmp(String n, double b) {
        name = n;
        basic = b;
    }

    abstract double pay();
}

class TryManager extends TryEmp {
    TryManager(String n, double b) {
        super(n, b);
    }

    double pay() {
        return basic + 0.40 * basic;
    }
}

class TryEngineer extends TryEmp {
    TryEngineer(String n, double b) {
        super(n, b);
    }

    double pay() {
        return basic + 0.20 * basic;
    }
}

class TryIntern extends TryEmp {
    TryIntern(String n, double b) {
        super(n, b);
    }

    double pay() {
        return basic;
    }
}

class Driver extends TryEmp {
    Driver(String n, double b) {
        super(n, b);
    }

    double pay() {
        return basic + 3000;
    }
}

class SalarySlipTryThis1 {
    public static void main(String[] args) {
        TryEmp[] e = {
            new TryManager("Meena", 50000),
            new TryEngineer("Ravi", 40000),
            new TryIntern("Anu", 12000),
            new Driver("Bala", 15000)
        };

        for (TryEmp x : e) {
            System.out.printf("%-8s %10.2f%n", x.name, x.pay());
        }
    }
}

/*
Output:
Meena     70000.00
Ravi      48000.00
Anu       12000.00
Bala      18000.00
*/
