// Case Study 2: Two-Package Fee Calculator
// Question: Create a model package com.scsvmv.fee.model containing Student
// and a service package com.scsvmv.fee.service containing FeeRule. Calculate
// the fees for Meena (BE), Ravi (ME), and Anu (BSc), display the fee table,
// and show the total fee collection.
//
// Try This Question:
// Create a third package com.scsvmv.fee.report to print the fee table.
// Keep FeeApp responsible only for creating the student list and calling
// the report package.

import com.scsvmv.fee.model.Student;
import com.scsvmv.fee.report.FeeReport;

class FeeApp {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Meena", "BE"),
            new Student("Ravi", "ME"),
            new Student("Anu", "BSc")
        };

        FeeReport.printFees(students);
    }
}

/*
Output:
NAME     COURSE        FEE
Meena    BE        75000.00
Ravi     ME        60000.00
Anu      BSc       40000.00
Total fee = 175000.00
*/
