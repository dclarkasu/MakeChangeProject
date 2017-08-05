//User Story #1
//
//The user is prompted asking for the price of the item.
//
//User Story #2
//
//The user is then prompted asking how much money was tendered by the customer.
//
//User Story #3
//
//Display an appropriate message if the customer provided too little money or the exact amount.
//
//User Story #4
//
//If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.
	//how many of each piece of currency ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is needed to make the change for the customer.
//Hints: % operator and using pennies as a base?

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		
		// Prompt: customer asks how much item is
			//method: dialogue with customer
		
		// Prompt how much money was tendered by customer
			//method: customer produces money --> was it too little or exact amount?
			// If statements, loop back to top of dialogue?
		
		//If statement: if money tendered > than price then change is given. How many bills, coins, and what amount?
			// Need to figure out how to RETURN change in correct denominations. How do we determine that?
	

	}

}

// Test conditions for grading: Amount: .67, Tendered: .50, Result: Error message
//Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
//Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
//Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
