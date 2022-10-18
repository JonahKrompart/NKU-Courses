package Penis.HW;
import java.util.Scanner;

public class SocialSecurityNum {
    public static void main(String[] s){
        //Create scanner object
        System.out.println("Enter SSN in this format DDD-DD-DDDD");
        Scanner in = new Scanner(System.in);

        //Initial boolean state of each digit part
        boolean first_part_is_digit=false;
        boolean second_part_is_digit=false;
        boolean third_part_is_digit=false;

        // Read input as sting
        String SSN =  in.next();


        //using suitable string function,
        //parse string and extract each digit
        // check SSN length

        int SSNlength = SSN.length();

        //make a decision to check if the length
        // exceeds or less than 11 characters
        if (SSNlength > 11){
            System.out.println(SSN +" exceeds required SSN digit length");
            System.exit(0);
        }
        else if (SSNlength < 11){
            System.out.println(SSN + " is less than required SNN digit length");
            System.exit(0);
        }

        //Get the position of the first minus(-)
        // and the position of the last minus(-)
        int pos_of_first_minus= SSN.indexOf("-");
        int pos_of_last_minus=SSN.lastIndexOf("-");
        System.out.println(pos_of_first_minus);
        System.out.println(pos_of_last_minus);

        //Extract each digit part using the minus positions
        String _3digit_part= SSN.substring(0,pos_of_first_minus-1);
        String _2digit_part= SSN.substring(pos_of_first_minus+1, pos_of_last_minus-1);
        String _4digit_part= SSN.substring(pos_of_last_minus+1, SSNlength);

        // SSN Validation Check section
        //*********************************
        //1.check if each digit part is a number or not
        //2.check if the length of each digit part is correct


        // checking of each character in the
        // 3 digit_part of the SSN



        if (Character.isDigit(_3digit_part.charAt(0)) &&
                Character.isDigit(_3digit_part.charAt(1)) &&
                Character.isDigit(_3digit_part.charAt(2))){
            first_part_is_digit = true;
        }

        if (Character.isDigit(_2digit_part.charAt(4)) &&
                Character.isDigit(_2digit_part.charAt(5)))
            second_part_is_digit = true;

        if (Character.isDigit(_4digit_part.charAt(4)) &&
                Character.isDigit(_4digit_part.charAt(4)) &&
                Character.isDigit(_4digit_part.charAt(4)) &&
                Character.isDigit(_4digit_part.charAt(4)))
            third_part_is_digit = true;

        //Display output
        //Check if the three parts of the SSN is true
        //the print number is a valid SSN
        //otherwise print number is not valid SSN
        if (first_part_is_digit && second_part_is_digit && third_part_is_digit)
            System.out.println(SSN + " is a valid Social Security Number");
        else
            System.out.println(SSN + " is not a valid Social Security Number");
    }
}
