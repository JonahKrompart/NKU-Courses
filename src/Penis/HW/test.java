package Penis.HW;
import java.util.Scanner;

public class test {

	public static int sum(String countryName) {
		//1. declare and intialize sum variabe
		int sum = 0;

		//2.
		//implement loop structure to tranverse string
		//and extract each chracter.
		//Then integer type cast character to get unicode value.
		//finally add unicode value to sum
		//loop begins
		//***************
		for(int i=0; i < countryName.length(); i++){
			sum += countryName.charAt(i);
		}
		//loop ends
		//***************


		//return  3.
		return sum;
	}
	  
	public static void main(String[] s) {
		 //#2. 
		 //Instantiate your scanner
		Scanner in = new Scanner(System.in);

		// #3
		// Display message telling user to input
		// first country name
		System.out.println("Enter first country: ");

		// #4
		// Use scanner object to read user input
		// for first country name into country1 variabe
		String country1 = in.nextLine();

		// #5
		// Display message telling user to input
		// second country name
		System.out.println("Enter second country: ");

		// #6
		// Use scanner object to read user input
		// for second country name into country2 variable
		String country2 = in.nextLine();

		// #7
		// Display message telling user to input
		// third country name
		System.out.println("Enter third country: ");
		
		// #8
		// Use scanner object to read user input
		// for third country name into country3 variable
		String country3 = in.nextLine();
		
		// #9
		//Use printf statement or any print format statement to print
		//the heading of the table by inserting 20 spaces between the
		//country and the Unicode Sum headings.
		//e.g. Country Name                   Unicode
		System.out.printf("%-20s%-20s%n", "Country Name", "Unicode");

		// #10
		//Use nested If structure and String compareToIgnoreCase method
		//to arrange the country ascending alphabetic order
		//call the sum method from the IF structure to compute the unicode sum
		//and use printf to print the result to align with the heading spaces

		System.out.printf("%-20s%-20s" + "\n", country1, sum(country1));
		System.out.printf("%-20s%-20s" + "\n", country2, sum(country2));
		System.out.printf("%-20s%-20s" + "\n", country3, sum(country3));
		}
		

}





