// Case Study 2 - Try This: Fee Report Package

package com.scsvmv.fee.report;

import com.scsvmv.fee.model.Student;
import com.scsvmv.fee.service.FeeRule;

public class FeeReport {
    public static void printFees(Student[] students) {
        double total = 0;

        System.out.printf("%-8s %-5s %10s%n", "NAME", "COURSE", "FEE");

        for (Student student : students) {
            double fee = FeeRule.fee(student.course);

            System.out.printf(
                "%-8s %-5s %10.2f%n",
                student.name,
                student.course,
                fee
            );

            total += fee;
        }

        System.out.printf("Total fee = %.2f%n", total);
    }
}
