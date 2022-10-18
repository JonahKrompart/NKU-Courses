package Penis.Exercises;
import java.util.Scanner;

public class Exercise04_05 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Sample input
        //Enter the number of sides: 5
        //Enter the length of the side: 6.5
        //The area of the polygon is 72.69017017488385

        //area = n * s ^ 2 / (4 * tan(pi / n))
        double n, s, area;

        System.out.println("Enter the number of sides: ");
        n = in.nextDouble();
        System.out.println("Enter the length of the side: ");
        s = in.nextDouble();

        area = (n * (Math.pow(s, 2))
                / (4 * (Math.tan(Math.PI / n)))
        );
        System.out.println("The area of the polygon is " + area);

    }
}
