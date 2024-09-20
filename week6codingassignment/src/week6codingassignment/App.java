   * War Card Game...abstract
  * Create a new Deck of Cards
  * Shuffle the Deck to randomized the order of Cards
  * Set The Players
  *Deal the Cards
  *Play the Game
  * Declare a winner
  
  
  Create a class called App with a main method.
  
        a) Instantiate a Deck and two Players, and call the shuffle method on the deck
        b) Using a traditional for loop iterate 52 times calling the Draw method
        c) Using a traditional for loop, iterate 26 times and call the flip method
        d) Compare the value of each card returned by the two player's with the flip method
        e) After the loop compare the final score from each player.
        f) Print the final score of each player and declare a winner either player 1 or player 2

public class App {
        	
        	public static void main(String() args) {
        		
        		//Add your code here to instantiate a Deck
        		
        		Deck deck = new Deck);
        		System.out.println("New Deck has been created");
        		System.class.out.println("..............");
        		
        		// Call the described method on the newly instantiated deck.
        	    deck.describe();
        	    
        	    
        	    //Add a shuffle method within the Deck Class to randomized the order of the cards.
        	    //System.out.println("Shuffle the cards to randomize the order of the cards");
        	    System.out.println(("Shuffled Deck");
        	    System.out.println("..............");
        		deck.shuffle();
        		
        		// Call the describe method on the newly shuffled deck. 
        		deck.describe();
        		
       
        	}

}
