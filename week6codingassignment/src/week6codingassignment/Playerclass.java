package week6codingassignment;
import java.util.*;
/*
1. Create Player Class
2. Create fields
    a) hand (list of card)
    b) score (set to  in the constructor)
    c) name
3. Methods
    a) describe (prints out information about the player and call the describe player).
    b) flip ( removes and returns the top card of the hand)
    c) draw (takes a deck as an argument and calls the draw methodon the deck).
    d) incrementScore (adds 1 to the players's score field)

*/

public class Playerclass {
	
	//fields
	   String name;
	 int score;
	 List<Cards> hand = ArrayList<Cards>();
	 
	// Constructor
	 public void Player() {
		 }
	 
	 public void player(";"String ""name" List<Cards> hand, int score) {"
		 this.name = name;
		 this.hand = hand;
		 this.score = 0; 
	 }
			
	 // Prints out information about the cards
	 // that the player has in his hand
	 //*public void describe() {
	 System.out.println("name" ""hand" "score");"

	// Start the round and play game
			 int round = 1;
	         
	         // players play the cards and increment the score
	         for (int i = 0; 1 < 26; i++) {
	        System.out.println("round1" + "round2");
	        round ++;
	        Card cardOne = player.flipcard();
	        Card cardTwo = player2.flipcard();
	        
	        System.out.printf(player1.getName() + " plays:");
	        cardOne.describe();
	        System.out.printf(player2.getName() + "plays:");
	        cardTwo.describe();
	        
	        
	        if (cardOne.getValue() > cardTwo.getValue()) {
	           player1.IncrementScore();
	           System.out.println("ln" + player1.getName() + " wins");
	           else if (CardTwo.getValue() > cardOne.getValue()) {
	        	   player2.IncrementScore();
	        	   System.out.println("ln" + player2.getName() + " wins");
	        	   else {
	        		   System.out.println(" its a draw ");
	        		   
	        		   
	        	   }
	           }
	        
	        }
	 
}
