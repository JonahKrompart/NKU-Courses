package Penis;
import java.util.Scanner;

public class LoanPayment {
    public static void main(String[] args) {
        //Declare scanner in the thing
        Scanner in = new Scanner(System.in);

        //Declare some variables
        double interestRate;
        int numYears;
        double amount;

        //Get the input
        System.out.println("Enter an interest rate: ");
        interestRate = in.nextDouble();
        System.out.println("Enter the number of years you will be paying off the loan: ");
        numYears = in.nextInt();
        System.out.println("Enter the amount for the loan: ");
        amount = in.nextDouble();

        //Declare some variables and do math
        double monthly;
        double monthlyRate;
        double total;

        monthlyRate = interestRate / 12;
        monthly = (amount * monthlyRate) / (1 - (1 / Math.pow((1 + monthlyRate), numYears)));
        total = monthly * 12 * numYears;

        //Output
        System.out.printf("%.2f\n", monthly);
        System.out.printf("%.2f", total);
    }
}