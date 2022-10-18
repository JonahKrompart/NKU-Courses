package Penis.HW;
import java.util.Scanner;

// a = v1 - v0 / t
public class Acceleration {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double v0, v1, t;
        System.out.println("Enter your starting acceleration: ");
        v0 = in.nextDouble();
        System.out.println("Enter your ending acceleration: ");
        v1 = in.nextDouble();
        System.out.println("Enter your time: ");
        t = in.nextDouble();

        // Calculate
        double accel = (v1 - v0) / t;
        System.out.println("Your acceleration is " + accel);

        //input: 5.6, 10.5, 0.5
        //output: 9.8
    }
}
