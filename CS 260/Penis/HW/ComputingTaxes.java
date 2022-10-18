package Penis.HW;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class ComputingTaxes {

    public static boolean isBetween(double x, int lower, int upper) {
        return lower <= x && x <= upper;
    }
    public static double single(double income){
        int rate = 0;
        if(isBetween(income, 0, 8350)){
            rate = 10;
        } else if (isBetween(income, 8351, 33950)) {
            rate = 15;
        }
        else if (isBetween(income, 33951, 82250)) {
            rate = 25;
        }
        else if (isBetween(income, 82251, 171550)) {
            rate = 28;
        }
        else if (isBetween(income, 171551, 372950)) {
            rate = 33;
        }
        else if (income > 372951) {
            rate = 35;
        }

        return rate;
    }
    public static double mfj(double income){
        int rate = 0;
        if(isBetween(income, 0, 16700)){
            rate = 10;
        }
        else if (isBetween(income, 16701, 67900)) {
            rate = 15;
        }
        else if (isBetween(income, 67901, 137050)) {
            rate = 25;
        }
        else if (isBetween(income, 137051, 208850)) {
            rate = 28;
        }
        else if (isBetween(income, 208851, 372950)) {
            rate = 33;
        }
        else if (income > 372951) {
            rate = 35;
        }

        return rate;
    }
    public static double mfs(double income){
        int rate = 0;
        if(isBetween(income, 0, 8350)){
            rate = 10;
        }
        else if (isBetween(income, 8351, 33950)) {
            rate = 15;
        }
        else if (isBetween(income, 33951, 68525)) {
            rate = 25;
        }
        else if (isBetween(income, 68526, 104425)) {
            rate = 28;
        }
        else if (isBetween(income, 104426, 186475)) {
            rate = 33;
        }
        else if (income > 186476) {
            rate = 35;
        }

        return rate;
    }
    public static double hoh(double income){
        int rate = 0;
        if(isBetween(income, 0, 11950)){
            rate = 10;
        }
        else if (isBetween(income, 16701, 45500)) {
            rate = 15;
        }
        else if (isBetween(income, 45501, 117450)) {
            rate = 25;
        }
        else if (isBetween(income, 117451, 190200)) {
            rate = 28;
        }
        else if (isBetween(income, 190201, 372950)) {
            rate = 33;
        }
        else if (income > 372951) {
            rate = 35;
        }

        return rate;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String status;
        int stat = 0;
        double tax, income;

        System.out.println("Enter your filing status (single, mfj, mfs, hoh): ");
        status = in.next();
        System.out.println("Enter your taxable income: ");
        income = in.nextInt();

        switch (status) {
            case "single" -> {}
            case "mfj" -> stat = 1;
            case "mfs" -> stat = 2;
            case "hoh" -> stat = 3;
            default -> {
                System.out.println("Error: invalid status");
                System.exit(0);
            }
        }

        if (stat == 0){
            tax = single(income);
            tax = tax / 100;
            income *= tax;
            System.out.printf("%.2f", income);
        }
        else if (stat == 1){
            tax = mfj(income);
            tax = tax / 100;
            income *= tax;
            System.out.printf("%.2f", income);
        }
        else if (stat == 2){
            tax = mfs(income);
            tax = tax / 100;
            income *= tax;
            System.out.printf("%.2f", income);
        }
        else if (stat == 3){
            tax = hoh(income);
            tax = tax / 100;
            income *= tax;
            System.out.printf("%.2f", income);
        }
    }
}
