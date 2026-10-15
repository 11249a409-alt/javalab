**Case Study 4 — Salary Slip for Different Employee Types (`SalarySlip.java`)**


// Case Study 4: Abstract parent + three pay rules

abstract class Emp {
    String name;
    double basic;

    Emp(String n, double b) {
        name = n;
        basic = b;
    }

    abstract double pay(); // Every child must implement this method
}

class Manager extends Emp {
    Manager(String n, double b) {
        super(n, b);
    }

    @Override
    double pay() {
        return basic + 0.40 * basic;
    }
}

class Engineer extends Emp {
    Engineer(String n, double b) {
        super(n, b);
    }

    @Override
    double pay() {
        return basic + 0.20 * basic;
    }
}

class Intern extends Emp {
    Intern(String n, double b) {
        super(n, b);
    }

    @Override
    double pay() {
        return basic;
    }
}

public class SalarySlip {
    public static void main(String[] args) {
        Emp[] e = {
            new Manager("Meena", 50000),
            new Engineer("Ravi", 40000),
            new Intern("Anu", 12000)
        };

        for (Emp x : e) {
            System.out.printf("%-8s %10.2f%n", x.name, x.pay());
        }
    }
}
```

**Output:**

Meena     70000.00
Ravi      48000.00
Anu       12000.00
```
