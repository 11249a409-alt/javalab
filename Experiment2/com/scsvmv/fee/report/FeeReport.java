// Case Study 2 - Try This 1: Fee Report Package
// Try This Question: Create a third package named com.scsvmv.fee.report
// that prints the student fee table and total. Update FeeApp so that it
// only creates the student array and calls FeeReport.

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
