import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the cash register!");
		System.out.println("Please enter the price of the item: ");
		double price = sc.nextDouble();
		System.out.println("Please enter how much cash was rendered from the customer: ");
		double cash = sc.nextDouble();

		if (price == cash) {
			System.out.println("The customer provided exact cash, no change required. ");
		} else if (price >= cash) {
			System.out.println("Customer didn't provide enough cash.");
		} else {
			double change = price - cash;
			change = change * -1;
			change = Math.round(change * 100.0) / 100.0;

			System.out.println("CHANGE DUE: " + change);
			int twenty = (int) Math.floor(change / 20);
			int ten = (int) Math.floor((change - twenty * 20) / 10);
			int five = (int) Math.floor((change - twenty * 20 - ten * 10) / 5);
			int one = (int) Math.floor((change - twenty * 20 - ten * 10 - five * 5) / 1);
			int quarter = (int) Math.floor((change - twenty * 20 - ten * 10 - five * 5 - one * 1) / 0.25);
			int dime = (int) Math
					.floor((change - twenty * 20 - ten * 10 - five * 5 - one * 1 - quarter * 0.25) / .10);
			int nickel = (int) Math
					.floor((change - twenty * 20 - ten * 10 - five * 5 - one * 1 - quarter * 0.25 - dime * 0.10) / .05);
			int penny = (int) Math.round(
					(change - twenty * 20 - ten * 10 - five * 5 - one * 1 - quarter * 0.25 - dime * .10 - nickel * 0.05)
							/ 0.01);
			if (twenty != 0) {
				System.out.println("Twenty dollar bills: " + twenty);
			}
			if (ten != 0) {
				System.out.println("Ten dollar bills: " + ten);
			}
			if (five != 0) {
				System.out.println("Five dollar bills: " + five);
			}
			if (one != 0) {
				System.out.println("One dollar bills: " + one);
			}
			if (quarter != 0) {
				System.out.println("Quarters: " + quarter);
			}
			if (dime != 0) {
				System.out.println("Dimes: " + dime);
			}
			if (nickel != 0) {
				System.out.println("Nickels: " + nickel);
			}
			if (penny != 0) {
				System.out.println("Pennies: " + penny);
			}

		}

	}

}
