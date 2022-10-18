package Penis.HW;
import java.util.Scanner;

/*
Write a program that prompts the user to enter a point (x, y) and checks
whether the point is within the rectangle centered at(0, 0) with width 10 and height 5.
For example, (2, 2)is inside the rectangle and(6, 4) is outside the rectangle.
(Hint: A point is in the rectangle if its horizontal distance to (0, 0) is
less than or equal to 10 / 2 and its vertical distance to (0, 0) is less than or equal to 5.0 / 2.
Test your program to cover all cases.)
 */

public class PointInRectangle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //variables
        double x, x2, y, y2;
        double rectW = 10;
        double rectH = 5;
        boolean inRect;

        System.out.println("Enter coordinates: ");
        x = in.nextDouble();
        x2 = x;
        if (x < 0)
            x2 = x * -1;

        y = in.nextDouble();
        y2 = y;
        if (y < 0)
            y2 = y * -1;


        inRect = (x2 <= rectW / 2.0 && y2 <= rectH / 2.0);
        String pointCheck = (inRect)? " is ": " is not ";

        System.out.println("The point (" + x + ", " + y + ")" + pointCheck + "inside the rectangle");

        //Sample Run 1: The point (2.0, 2.0) is in the rectangle
        //Sample run 2: The point (6.0, 4.0) is not in the rectangle
        //Sample Run 3: The point (-5.1, -2.4) is not in the rectangle
        //Sample Run 4: The point (-4.9, 2.49) is in the rectangle
        //Sample Run 5: The point (-4.99, -2.499) is in the rectangle
    }
}
