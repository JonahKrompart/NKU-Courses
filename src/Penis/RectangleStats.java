package Penis;
import java.util.Scanner;

/*
Write a program that prompts the user to enter the width and
height of a rectangle and displays the perimeter, area, and
the length of diagonal.

diagonal: sqrt(l^2 + w^2)
 */

public class RectangleStats {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double l, w, perim, area, diag;

        System.out.println("Enter a length: ");
        l = in.nextDouble();
        System.out.println("Enter a width: ");
        w = in.nextDouble();

        perim = (w * 2) + (l * 2);
        area = l * w;
        diag = Math.sqrt(Math.pow(l, 2) + Math.pow(w, 2));

        System.out.printf("The perimeter is %,.2f\n", perim);
        System.out.printf("The area is %,.2f\n", area);
        System.out.printf("The diagonal is %,.2f", diag);

        /*
        input:
        4.25, 7.26

        output:
        The perimeter is 23.02
        The area is 30.86
        The diagonal is 8.41
        */
    }
}