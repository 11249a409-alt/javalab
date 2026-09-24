==================================================
CASE STUDY 2 — TWO-PACKAGE FEE CALCULATOR
==================================================

-------------------- File 1: Student.java --------------------

package com.scsvmv.fee.model;

public class Student {
    public String name;
    public String course;

    public Student(String n, String c) {
        name = n;
        course = c;
    }
}


-------------------- File 2: FeeRule.java --------------------

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


-------------------- File 3: FeeApp.java --------------------

import com.scsvmv.fee.model.Student;
import com.scsvmv.fee.service.FeeRule;

public class FeeApp {

    public static void main(String[] args) {

        Student[] s = {
            new Student("Meena", "BE"),
            new Student("Ravi", "ME"),
            new Student("Anu", "BSc")
        };

        double total = 0;

        for (Student x : s) {

            double f = FeeRule.fee(x.course);

            System.out.printf("%-8s %-5s %10.2f%n",
                    x.name, x.course, f);

            total = total + f;
        }

        System.out.printf("Total fee = %.2f%n", total);
    }
}


-------------------- OUTPUT --------------------

Meena    BE       75000.00
Ravi     ME       60000.00
Anu      BSc      40000.00
Total fee = 175000.00
