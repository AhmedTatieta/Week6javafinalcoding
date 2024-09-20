package week6codingassignment;
/*
 1. Create the card class:
 2. Create two fields:
    a) value (contains a value from 2-14 representing cards 2-Ace)
    b) name (e.g. Ace of Diamonds, or Two of Hearts)
 3. Create Methods:
    a) Getters and Setters
    b) describe (prints out information about a card)
 */

public class Card {
	// (e.g. "Ace of Diamonds", or "Two of Hearts")
	String name;
	//contains a value from 2-14 representing cards 2-Ace
	int value;
	
	public Card(int value. String suit) {
		thisvalue = value;
		switch(value) {
		case 2:
			name = "Two";
			break;
		case 3:
			name = "Three";
			break;
		case 4:
			name = "Four";
			break;
		case 5:
			name = "Five";
		case 6:
			name = "six";
			break;
		case 7:
			name = "Seven";
			break;
		case 8:
			name = "Eight";
			break;
		case 9:
			name = "Nine";
			break;
		case 10:
			name = "Ten";
			break;
		case 11:
			name = "Jack";
			break;
		case 12:
			name = "Queen";
			break;
		case 13:
			name = "King";
		case 14:
			name = "Ace";
			break;
		}
		
		name += " of " + suit; 
		
	}
	
	
	@Override
	public String toString() {
		//TODO Auto-generated method stub
		return name;
	}
	
	
	public void describe() {
		
	  System.out.println(name); 
			
		}
	}

}
