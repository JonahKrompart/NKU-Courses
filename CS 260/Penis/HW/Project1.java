package Penis.HW;
import java.util.Scanner;
public class Project1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: " );
        String str = input.nextLine();

        System.out.print("Enter a character: ");
        String string = input.nextLine();
        char ch = string.charAt(0);


        System.out.println("The number of occurrences of \"" + ch + "\" in \""
                + str + "\" is: " + count(str, ch));
    }
    public static int count(String str, char a) {
        int count = 0; // Initialize count to 0

        for (int i = 0; i < str.length(); i++) {
            if (a == str.charAt(i))
                count++;
        }
        return count;
    }
}