package Penis;
import java.util.Scanner;

@SuppressWarnings("IntegerDivisionInFloatingPointContext")
public class SlopeInterceptForm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1, y1, x2, y2, m, b;
        String noM, noB, neg;

        System.out.println("Enter the coordinates for two points: ");
        x1 = in.nextDouble();y1 = in.nextDouble();x2 = in.nextDouble();y2 = in.nextDouble();
        m = (y1 - y2) / (x1 - x2);

        //find -b and multiply by -1
        b = (m * x1) - y1;
        b *= -1;

        //round numbers
        m = Math.round(m * 100) / 100;
        b = Math.round(b * 100) / 100;

        noM = (m != 1)? m + "x" : "x";
        noB = (b != 0) ? "" + b : "";
        neg = (b < 0)? " " : " + ";
        System.out.printf("The line equation for two points (%.1f, %.1f) and (%.1f, %.1f) is y = " + noM + neg + noB,
                x1, y1, x2, y2);
    }
}
