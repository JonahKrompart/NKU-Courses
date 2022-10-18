package Penis.HW;
import org.jetbrains.annotations.*;
import java.util.Scanner;
public class CheckPassword {
    //Test for valid password
    public static boolean isValidPassword(String password) {
        final int MIN_LENGTH = 8;	
        final int MIN_DIGITS = 2;	

        return isLengthValid(password, MIN_LENGTH) && isOnlyLettersAndDigits(password) && hasNDigits(password, MIN_DIGITS);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Prompt user input
        System.out.print("Enter a password: ");
        String password = in.nextLine();

        //Output
        System.out.println((isValidPassword(password) ? "Valid " : "Invalid ") + "Password");
    }

    //Check for valid length
    public static boolean isLengthValid(@NotNull String password, int validLength) {
        return password.length() >= validLength;
    }

    //Checks if the password has only letters and digits
    public static boolean isOnlyLettersAndDigits(@NotNull String password) {
        int i = 0;
        while(i < password.length()) {
            if(!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    //Checks if there are at least N digits in the password
    public static boolean hasNDigits(@NotNull String password, int n) {
        int numberOfDigits = 0;
        int i = 0;
        while (i < password.length()) {
            if (Character.isDigit(password.charAt(i))) {
                numberOfDigits++;
            }
            if (numberOfDigits >= n) {
                return true;
            }
            i++;
        }
        return false;
    }
}
