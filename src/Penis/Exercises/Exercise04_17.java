package Penis.Exercises;
import java.util.Scanner;
public class Exercise04_17{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a year and
        // the first three letter of a month name
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();

        // Test for leap year
        boolean leapYear =
        ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        
        if(month.equals("Jan") || month.equals("Feb") || month.equals("Mar") || month.equals("Apr") || month.equals("May")
        || month.equals("Jun") || month.equals("Jul")|| month.equals("Aug") || month.equals("Sep") || month.equals("Oct")
        || month.equals("Nov") || month.equals("Dec")) {
            if (month.equals("Jan") || month.equals("Mar") ||
                    month.equals("May") || month.equals("Jul") ||
                    month.equals("Aug") || month.equals("Oct") ||
                    month.equals("Dec"))
                System.out.print(month + " " + year + " has " + 31 + " days");
            else if (month.equals("Apr") || month.equals("Jun") ||
                    month.equals("Sep") || month.equals("Nov"))
                System.out.print(month + " " + year + " has " + 30 + " days");
            else
                System.out.print(month + " " + year + " has " + ((leapYear) ? 29 : 28) + " days");
        }
        else
            System.out.println(month + " is not a correct month name");
    }
}