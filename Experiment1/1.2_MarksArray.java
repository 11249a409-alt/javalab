// Experiment 1.2: Arrays, control statements and operators
class MarksArray {
    public static void main(String[] args) {
        int[] marks = {78, 91, 45, 66, 88};
        int total = 0;

        for (int mark : marks) {
            total += mark;

            if (mark >= 50)
                System.out.println(mark + " Pass");
            else
                System.out.println(mark + " Fail");
        }

        double average = (double) total / marks.length;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }
}

/*
Output:
78 Pass
91 Pass
45 Fail
66 Pass
88 Pass
Total = 368
Average = 73.6
*/
