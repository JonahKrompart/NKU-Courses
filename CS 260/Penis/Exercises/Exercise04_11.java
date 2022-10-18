package Penis.Exercises;

import java.util.Scanner;

public class Exercise04_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Enter a decimal value (0 to 15): [input]
        //The hex value is [output]
        //"[bad input] is an invalid input"

        int x;
        System.out.println("Enter a decimal value (0 to 15): ");
        x = in.nextInt();
        if(x >= 0 && x <= 15)
            System.out.println("The hex value is " + (Integer.toHexString(x)).toUpperCase());
        else
            System.out.println(x + " is an invalid input");
    }
}
