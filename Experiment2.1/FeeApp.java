// Case Study 2: Two-Package Fee Calculator

import com.scsvmv.fee.model.Student;
import com.scsvmv.fee.report.FeeReport;

public class FeeApp {
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
