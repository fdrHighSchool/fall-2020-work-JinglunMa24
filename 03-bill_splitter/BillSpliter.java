import java.util.*;

public class BillSpliter{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Bill-Splitter");
		System.out.print("Enter the total, pre-tax: ");
		double total = input.nextInt();

		System.out.print("How many people? ");
		double numPeople = input.nextInt();

		double perPerson = total / numPeople;

		System.out.print("What is the percent of tax you are paying?");
		double percentTax = input.nextInt();
		double tax = (total * ((double)percentTax / 100));

		System.out.print("How much is the tip are you paying?");
		double tip = input.nextInt();

		System.out.println("Each person must pay $" + perPerson + ", tax $" + tax + ", and tip $" + tip);

	}//end main method
}//end class
//
