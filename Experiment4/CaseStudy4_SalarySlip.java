// Experiment 4: Case Study 4 - Salary Slip
// Question: A manager, engineer and intern receive different pay.
// Use an abstract parent with pay() and one array with a single loop.

abstract class Emp {
    String name;
    double basic;

    Emp(String n, double b) {
        name = n;
        basic = b;
    }

    abstract double pay();
}

class SalaryManager extends Emp {
    SalaryManager(String n, double b) {
        super(n, b);
    }

    double pay() {
        return basic + 0.40 * basic;
    }
}

class Engineer extends Emp {
    Engineer(String n, double b) {
        super(n, b);
    }

    double pay() {
        return basic + 0.20 * basic;
    }
}

class Intern extends Emp {
    Intern(String n, double b) {
        super(n, b);
    }

    double pay() {
        return basic;
    }
}

class SalarySlip {
    public static void main(String[] args) {
        Emp[] e = {
            new SalaryManager("Meena", 50000),
            new Engineer("Ravi", 40000),
            new Intern("Anu", 12000)
        };

        for (Emp x : e) {
            System.out.printf("%-8s %10.2f%n", x.name, x.pay());
        }
    }
}

/*
Output:
Meena     70000.00
Ravi      48000.00
Anu       12000.00
*/
