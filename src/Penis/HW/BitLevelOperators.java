package Penis.HW;
import java.util.Scanner;
public class BitLevelOperators {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Prompt user input
        System.out.print("Enter an integer: ");
        short number = in.nextShort();

        StringBuilder bits = new StringBuilder();

        //Get 16 bits for integer
        for (int i = 0; i < 16; i++) {
            bits.insert(0, (number & 1));
            //Shift bits to the right with >>
            number = (short)(number >> 1);
        }

        //Output
        System.out.println("The 16 bits are " + bits);
    }
}
