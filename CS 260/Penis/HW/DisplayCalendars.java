package Penis.HW;
import java.util.Scanner;
public class DisplayCalendars{
    public static void main(String[] strings){
        Scanner in = new Scanner(System.in);

        //Prompt user input
        System.out.print("Enter a year: ");
        int year = in.nextInt();

        System.out.print("Enter the first day of the year: ");
        int startDay = in.nextInt();

        //Switch statement for months
        int numberOfDaysInMonth;
        for(int month = 1; month <= 12; month++){
            System.out.print("        ");
            switch(month){
                case 1 ->{
                    System.out.println("January " + year);
                    numberOfDaysInMonth = 31;
                }
                case 2 ->{
                    System.out.println("February " + year);
                    if((year % 400 == 0)||((year % 4 == 0)&&(year % 100 != 0))){
                        numberOfDaysInMonth = 29;
                    }else{
                        numberOfDaysInMonth = 28;
                    }
                }
                case 3 ->{
                    System.out.println("March " + year);
                    numberOfDaysInMonth = 31;
                }
                case 4 ->{
                    System.out.println("April " + year);
                    numberOfDaysInMonth = 30;
                }
                case 5 ->{
                    System.out.println("May " + year);
                    numberOfDaysInMonth = 31;
                }
                case 6 ->{
                    System.out.println("June " + year);
                    numberOfDaysInMonth = 30;
                }
                case 7 ->{
                    System.out.println("July " + year);
                    numberOfDaysInMonth = 31;
                }
                case 8 ->{
                    System.out.println("August " + year);
                    numberOfDaysInMonth = 31;
                }
                case 9 ->{
                    System.out.println("September " + year);
                    numberOfDaysInMonth = 30;
                }
                case 10 ->{
                    System.out.println("October " + year);
                    numberOfDaysInMonth = 31;
                }
                case 11 ->{
                    System.out.println("November " + year);
                    numberOfDaysInMonth = 30;
                }
                case 12 ->{
                    System.out.println("December " + year);
                    numberOfDaysInMonth = 31;
                }
                default -> throw new IllegalStateException("Unexpected value: " + month);
            }

            //Draw line and weekday headers
            System.out.println("─────────────────────────────");
            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

            //Write in days
            for(int i = 0; i < startDay; i++){
                System.out.print("    ");
            }

            for(int i = 1; i <= numberOfDaysInMonth; i++)
            {
                if(i < 10){
                    System.out.print("   " + i);
                }else{
                    System.out.print("  " + i);
                }
                if((i + startDay)% 7 == 0){
                    System.out.println();
                }
           }
            //Spacing to make it look nice
            System.out.println("\n");

            //Fix start day
           startDay =(startDay + numberOfDaysInMonth) % 7;
       }
    }
}