package Penis;
import java.util.*;

public class TESTJANKCODEHERE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner
        //Write a program that passes an unspecified number of integers from command line
        //and displays their total.
        //command>java 1 2 3 4 5
        //The total is 15
        int num=0, total=0;
        for (String arg : args) {
            num = Integer.parseInt(arg);
            total+=num;
        }
        System.out.println("The total is " + total);
    }
}