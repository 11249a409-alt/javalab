# Experiment 2 — Try These Next: Two-Package Fee Calculator

## 1. Add a Third Package for Fee Report

### File 1: Student.java

package com.scsvmv.fee.model;

public class Student {
    public String name;
    public String course;

    public Student(String n, String c) {
        name = n;
        course = c;
    }
}


### File 2: FeeRule.java

package com.scsvmv.fee.service;

public class FeeRule {
    public static double fee(String course) {
        if (course.equals("BE"))
            return 75000;

        if (course.equals("ME"))
            return 60000;

        return 40000;
    }
}


### File 3: FeeReport.java

package com.scsvmv.fee.report;

import com.scsvmv.fee.model.Student;
import com.scsvmv.fee.service.FeeRule;

public class FeeReport {

    public static void print(Student[] students) {

        double total = 0;

        System.out.println("NAME     COURSE       FEE");

        for (Student x : students) {
            double f = FeeRule.fee(x.course);

            System.out.printf("%-8s %-8s %10.2f%n",
                    x.name, x.course, f);

            total = total + f;
        }

        System.out.printf("Total fee = %.2f%n", total);
    }
}


### File 4: FeeApp.java

import com.scsvmv.fee.model.Student;
import com.scsvmv.fee.report.FeeReport;

public class FeeApp {
    public static void main(String[] args) {

        Student[] s = {
            new Student("Meena", "BE"),
            new Student("Ravi", "ME"),
            new Student("Anu", "BSc")
        };

        FeeReport.print(s);
    }
}


## Output

NAME     COURSE       FEE
Meena    BE        75000.00
Ravi     ME        60000.00
Anu      BSc       40000.00
Total fee = 175000.00


## 2. Remove public from Student Class

### Modified Statement

class Student {

### Compiler Error

Student is not public in com.scsvmv.fee.model;
cannot be accessed from outside package

### Result

The Student class cannot be accessed from FeeApp because Student is not declared public and FeeApp belongs to a different package.
