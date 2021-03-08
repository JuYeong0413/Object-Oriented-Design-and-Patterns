/*
 * OOP Assignment 1
 * Contains methods for interaction with user
 */
import java.util.Scanner;
public class CardInteraction {
	private Scanner scanner;
	private CardOrder card;
	
	public CardInteraction() {
		scanner = new Scanner(System.in);
	}

	//runs the program as follows:
	//Gets details of card name from user
	//Displays card
	//Repeatedly, until user responds ok
	//	Asks the user if they would like to change the border
	//	If so, change the border and print the new card
	//Print the price of the order
	//print whether a discount is applicable or not
	public void run() {
		//Alter this gradually to add more details
		String userName;
		String response;
		int cardQuantity;

		userName = getNameFromUser();
		CardOrder order = new CardOrder(userName);

		while (true) {
			System.out.print(order.getSampleCard());

			System.out.print("Enter \"OK\" if this card is ok, otherwise enter an alternative border character: ");
			response = scanner.next();

			if (response.toUpperCase().equals("OK")) break;
			else order.setBorder(response.charAt(0));
		}

		cardQuantity = getNumberFromUser();
		order.setNumCards(cardQuantity);

		System.out.println("\nThe price of " + order.getNumCards() + " cards is " + (int) order.getFinalCost() + " won.");

		if (order.hasDiscount()) System.out.println("10% discount applied");
		else System.out.println("No discount given");
	}

	//repeatedly requests and reads name from user
	//until valid (i.e. <=28 chars and contains at least one space
	//finally returns the valid text
	private String getNameFromUser() {
		//use this value until more code written
		String name;

		while (true) {
			System.out.print("Enter name: ");
			name = scanner.nextLine();

			if (!name.contains(" ") || name.length() > 28) System.out.println("Invalid name. Please enter again.");
			else break;
		}

		return name;
	}
	
	//repeatedly requests and reads number from user
	//until valid number entered i.e. between 1 and 1000
	//finally returns the valid number	
	private int getNumberFromUser() {
		//use this number until more code written
		int quantity;

		while (true) {
			System.out.print("\nHow many cards would you like? ");
			quantity = scanner.nextInt();

			if (quantity < 1 || quantity > 1000) System.out.println("Invalid quantity. Please enter again.");
			else return quantity;
		}
	}
	
	private void getBorderFromUser() {
		String response;

		while (true) {
			System.out.print("Enter \"OK\" if this card is ok, otherwise enter an alternative border character: ");
			response = scanner.next();
			System.out.println(response);

			if (response.toUpperCase().equals("OK")) break;
			else card.setBorder(response.charAt(0));
		}
	}
}


