/**
 * OOP Assignment One
 * CardOrder class keeps details of one card order
 * and provides methods to print a card 
 * and determine the price
 *
 */
public class CardOrder {
	private Name name;  	//the name printed on the card
	private char border;    //the card border
	private int numCards;   //the number of cards to be printed
	
	private static final int CARD_LEN = 32;  //the length of the card in characters
	
	//initialises name from value in parameter
	//and sets other instance variables to suitable default values
	//you can create a Name from a single string after L5
      //If you want to start before then, just write name = new Name("A", "B", "C") in the constructor!
	public CardOrder(String fullName) {
		String[] name = fullName.split(" ");
		if (name.length < 3) this.name = new Name(name[0], name[1]);
		else this.name = new Name(name[0], name[1], name[2]);
		this.border = '*';
		this.numCards = 0;
	}
	
	///////////////////////////////////////////
	//accessor/mutator methods
	
	//returns the character used in the border
	public char getBorder() {
		return border;
	}
	
	//sets the character used in the border 
	//to that provided in the parameter
	public void setBorder(char ch) {
		this.border = ch;
	}
	
	//returns the name 
	public Name getName() {
		return name;
	}
	
	//sets the name used in the card
	//to that provided in the parameter
	public void setName(Name name) {
		this.name = name;
	}
	
	//returns the number of cards to be printed
	public int getNumCards() {
		return numCards;
	}
	
	//sets the number of cards to be printed 
	//to that provided in the parameter
	public void setNumCards(int n) {
		this.numCards = n;
	}
	///////////////////////////////////////////
	
	//returns a sample card, including a newline at the end of each line
	public String getSampleCard() {
		System.out.println("\nHere is a sample card: \n");
		return getTopLine() + getBlankLine() + this.getLineWithName()
		       + getBlankLine() + getTopLine() + "\n";
	}
	
	//returns a String containing the top or bottom line
	//of a card, including a newline character at the end
	private String getTopLine() {
		//use this value until more code written
		String topLine;
		int borderNum;

		if (name.hasMiddleName) borderNum = CARD_LEN - 6;
		else borderNum = CARD_LEN - 4;

		topLine = name.getInits() + String.valueOf(border).repeat(borderNum) + name.getInits() + "\n";

		return topLine;
	}
	
	//returns a String containing the blank line
	//of a card, with a border char at each end
	//and including the newline character	
	private Object getBlankLine() {
		//use this value until more code written
		int spaceNum = CARD_LEN - 2;
		String blankLine;

		blankLine = border + " ".repeat(spaceNum) + border + "\n";
		return blankLine;
	}
	
	//returns a String containing the name line
	//of a card, including name, padding and border
	//and including the newline character	
	private String getLineWithName() {
		//use this value until more code written
		String lineWithName;
		int nameLength = name.getNameLine().length();
		int spaceLength = CARD_LEN - 2 - nameLength;

		if (spaceLength % 2 == 0) {
			int spaceNum = spaceLength / 2;

			lineWithName = border + " ".repeat(spaceNum) + name.getNameLine() + " ".repeat(spaceNum) + border + "\n";
		} else {
			int leftSpaceNum = spaceLength / 2 + 1;
			int rightSpaceNum = spaceLength / 2;

			lineWithName = border + " ".repeat(leftSpaceNum) + name.getNameLine() + " ".repeat(rightSpaceNum) + border + "\n";
		}

		return lineWithName;
	}
	
	//returns the price of one card
	//in won (i,e either 40 or 50)
	//based on the number of characters in the name to be printed
	//40 if <=12 otherwise 50
	public double getCardPrice() {
		//use this value until more code written
		double price;
		if (name.getNameLength() <= 12) price = 40;
		else price = 50;

		return price;
	}

	//returns the final cost of the order
	//which is the number of cards multiplied by the card price
	//and reduced by 10% if >= 100 cards
    public double getFinalCost() {
		//use this value until more code written
		double finalCost = getCardPrice() * numCards;
		if (hasDiscount()) finalCost *= 0.9;

		return finalCost;
    }
    
    //returns true if number of cards >= 200, false otherwise
    public boolean hasDiscount() {
		return (numCards >= 200);
    }
}
