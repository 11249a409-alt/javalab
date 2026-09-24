AIM:

To write a Java program to create a Student class with roll number, name, and marks, and display the details of two students using objects and methods.


ALGORITHM:

1. Start the program.
2. Create a class named Student.
3. Declare roll, name, and marks as data members.
4. Define the set() method to assign values to the data members.
5. Define the show() method to display the student details.
6. Create two objects s1 and s2 of the Student class.
7. Assign values to s1 and s2 using the set() method.
8. Display the heading "ROLL NAME MARKS".
9. Display the details of both students using the show() method.
10. Stop the program.


SOURCE CODE:

class Student {
    int roll;
    String name;
    int marks;

    void set(int r, String n, int m) {
        roll = r;
        name = n;
        marks = m;
    }

    void show() {
        System.out.println(roll + " " + name + " " + marks);
    }
}

public class StudentDemo {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.set(101, "Aravind", 78);
        s2.set(102, "Divya", 91);

        System.out.println("ROLL NAME MARKS");

        s1.show();
        s2.show();
    }
}


OUTPUT:

ROLL NAME MARKS
101 Aravind 78
102 Divya 91
