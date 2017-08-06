import java.util.Scanner;

public class MakeChange {
	static int[] cashAmt = { 2000, 1000, 500, 100, 25, 10, 5, 1 };//array containing doubles for doing actual calculations
	static String[] bills = { "$20's", "$10's", "$5's", "$1's", ".25c", ".10c", ".05c", ".01c" };//array contains Strings so that it outputs labels instead of just the digit for how many are needed
	static String[] bill = { "$20", "$10", "$5", "$1", ".25c", ".10c", ".05c", ".01c" }; //bill is singular b/c it is for when there is only 1 required $ unit

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		//declared in main so must be passed into methods. (Doesn't have to have same name)
		char answer;									//made a char in order to better check for their answer

		do {											
			runTransaction(scanner);					//Jump to line 36
			System.out.println();
			System.out.println("Would you like to make another purchase (Y/N)?");
			answer = scanner.next().toLowerCase().charAt(0);
		} while (answer == 'y');
		
		scanner.close();
	}

	public static void runTransaction(Scanner kb) {
		double price, tender;
		int changeToGive;											

		// Prompt: customer asks how much item is
		System.out.println("\n" + "Excuse me, how much is this item?");
		System.out.println("That item is: ");
		price = kb.nextDouble();
		System.out.println();

		// Prompt: how much money was tendered by customer
		System.out.print("Thanks, here is my money: ");
		tender = kb.nextDouble();

		// Determines whether or not they provided enough money for purchase and gives an appropriate response.
		if (tender < price) {
			System.out.println("Please tender the correct amount, that is not enough");
		} else if (tender == price) {
			System.out.println("Thank you, you've given me the exact amount");
		} else {
			System.out.println("Thank you, let me get your change");
			changeToGive = (int) ((100 * tender) - (100 * price)); 
			//if we don't multiply by 100 we won't get the right amount of cents when the subtraction occurs
			createChange(changeToGive);
		}
	}

	public static void createChange(int changeToGive) {
		for (int i = 0; i < cashAmt.length; i++) {            //iterates throughout array
			int amounts = (int) (changeToGive / cashAmt[i]);  //division yields how much of each value($ unit) will go into the tendered amt. Then, casted to an int
			changeToGive = changeToGive % cashAmt[i];			//
			if (amounts > 1) {								//amounts is our counter, keeping track of how much each value
				System.out.println(amounts + " " + bills[i]);//> 1 so plural "'s"
			} 
			else if (amounts == 1) {
				System.out.println(amounts + " " + bill[i]);
			}
		}
	}
}

// Test conditions for grading: Amount: .67, Tendered: .50, Result: Error
// message
// Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
// Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
// Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
