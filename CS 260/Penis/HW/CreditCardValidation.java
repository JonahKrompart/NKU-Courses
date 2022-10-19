package Penis.HW;
import java.util.Scanner;
public class CreditCardValidation{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Prompt user input
        System.out.print("Enter a credit card number as a long integer: ");
        long number = input.nextLong();

        //Output
        System.out.println(number + " is " + (isValid(number) ? "valid" : "invalid"));
    }

    //Check validity of card number
    public static boolean isValid(long number) {
        return (getSize(number) >= 13 && getSize(number) <= 16) && (prefixMatched(number, 4) || prefixMatched(number, 5) ||
                prefixMatched(number, 37) || prefixMatched(number, 6)) && ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
    }

    //Finish second step
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
        }
            return sum;
    }

    //Return if single digit, sum if two digits
    public static int getDigit(int number) {
        if (number < 9)
            return number;
        else
            return number / 10 + number % 10;
    }

    //Sum of odds place digits
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String num = number + "";
        for (int i = getSize(number) - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt(num.charAt(i) + "");
        }
        return sum;
    }

    //Return d if it's a prefix
    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    //Return digits in d
    public static int getSize(long d) {
        String num = d + "";
        return num.length();
    }

    //First k digits
    public static long getPrefix(long number, int k) {
        if (getSize(number) > k)  {
            String num = number + "";
            return  Long.parseLong(num.substring(0, k));
        }
        return number;
    }
}
