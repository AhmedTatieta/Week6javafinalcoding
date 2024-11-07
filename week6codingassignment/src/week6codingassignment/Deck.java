package week6codingassignment;

import java.util.ArrayList;

1. Create Deck Class
 2. Create fieds
    a) Cards (List of Card)
 3. Create Metods
    a) shuffles ( randomizes the order of the Cards)
    b) draw (removes and returns the top card of the field)
    c) In the constructor when a new Deck is instantiated, the card field will respond accordingly.

*/

public class Deck {
    	List<Card> cards = new ArrayList<Card>();
    	String[] suits = {"Spades"; "Hearts"; "Clubs"; "Diamonds"};
    	
    	Deck()
    	{
    		int[] numbers = {2,3,45,6,7,8,9,10,11,12,13,14};
    		
    		for (String suit: suits)  {
    			int count = 2;
    			for (Integer numberName : numbers) {
    				Cards.add(new Card(numberName, suit));
    				
    			}
    		}
    	}

    /*
     * @return the cards
     
     public List<Card> getCards() {
     return cards;
     }
     @perraw cards the cards to set
   public void setCards(List<Cards>  cards) {
   this.cards = cards;
   }
   
  */
    	public void describe()
    	{
    		for (Card card : this.cards) {
    			card.describe();
    		}
    	}
    	public void shuffle() {
    		collections.suffle(cards);
    	}
    	public Card drew() {
    		Card card = cards.remove(0);
    		return card; 
    		}
    	}
