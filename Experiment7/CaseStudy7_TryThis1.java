// Case Study 7: Try This
// Find the topper from the marks file.

import java.io.*;

class CaseStudy7TryThis1 {
    public static void main(String[] args) {
        String topper = "";
        int highest = -1;

        try (BufferedReader br =
                 new BufferedReader(new FileReader("student.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                String[] f = line.split(",");
                int marks = Integer.parseInt(f[2]);

                if (marks > highest) {
                    highest = marks;
                    topper = f[1];
                }
            }

            System.out.println("Topper : " + topper);
            System.out.println("Highest marks : " + highest);
        } catch (IOException e) {
            System.out.println("File error : " + e.getMessage());
        }
    }
}

/*
Output:
Topper : Divya
Highest marks : 91
*/
