package Penis.HW;
import java.util.Scanner;

/*
(Algebra: solve quadratic equations)
The two roots of a quadratic equation ax^2 + bx + c = 0 can be obtained
using
the following formula:
r1 = (-b + sqrt(b^2 - 4ac)) / (2a)
and
r2 = (-b - sqrt(b^2 - 4ac)) / (2a)
b^2 - 4ac is called the discriminant of the quadratic equation. If it is
positive, the equation has two real roots. If it is zero, the equation has one root.
If it is negative, the equation has no real roots.
Write a program that prompts the user to enter values for a, b, and c and
displays the result based on the discriminant.
If the discriminant is positive, display two roots.
If the discriminant is 0, display one root.
Otherwise, display The equation has no real roots.
Note that you can use Math.pow(x, 0.5) to compute sqrt(x).
 */


public class QuadraticEquations {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //r1 = (-b + sqrt(b^2 - 4ac)) / (2a)
        //r2 = (-b - sqrt(b^2 - 4ac)) / (2a)
        double a, b, c;

        System.out.println("Enter the variables a, b, and c: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        double disc = Math.pow(b, 2) - (4 * a * c);
        double r1 = ((0 - b) + Math.sqrt(disc)) / (2 * a);
        double r2 = ((0 - b) - Math.sqrt(disc)) / (2 * a);

        if(disc > 0)
            System.out.println("The equation has two roots " + r1 + "and " + r2);
        else if(disc == 0)
            System.out.println("The equation has one root " + r2);
        else
            System.out.println("The equation has no real roots");

        // OUTPUTS
        // Sample Run 1: The equation has two roots -0.381966 and -2.61803
        // Sample Run 2: The equation has one root -1
        // Sample Run 3: The equation has no real roots
    }
}
