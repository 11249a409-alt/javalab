// Experiment 2.1: Package Creation and Usage
// Question: Create a user-defined package named com.scsvmv.util containing
// MathUtil with static methods square(int) and cube(int). Import the package
// and display the square of 7 and the cube of 3.

import com.scsvmv.util.MathUtil;

class UseMath {
    public static void main(String[] args) {
        System.out.println("Square of 7 = " + MathUtil.square(7));
        System.out.println("Cube of 3 = " + MathUtil.cube(3));
    }
}

/*
Output:
Square of 7 = 49
Cube of 3 = 27
*/
