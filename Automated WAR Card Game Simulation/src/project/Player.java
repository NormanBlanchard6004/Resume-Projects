package project;

import java.util.ArrayList;
import java.util.List;

public class Player {
	// Fields 
	List<Card> hand;
	int score = 0;
	String name = "";
	// hand (List of Card)
	public Player (String name) {
		this.name = name;
		this.score = 0;
		this.hand = new ArrayList<>();
	}
	// Methods
	
	// describe (prints out information about the player and calls the describe method for each card in the Hand list)
	public void describe() {
		System.out.println("Player " + name + " Score " + score);	
		for (int i = 0; i < hand.size(); i++) {
			hand.get(i).describe();	
		}
		}
	// flip (removes and returns the top card of the Hand)
	public Card flip() {
		Card flippedCard = hand.get(0);
		hand.remove(0);
		return flippedCard;
	}
	// draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
	public void draw(Deck thisDeck) {
		List<Card> thisCard;
		thisCard = thisDeck.draw();
		for (int i = 0; i < thisCard.size(); i++) {
			hand.add(thisCard.get(i));
		}
	}
	// incrementScore (adds 1 to the Player's score field)
	public void incrementScore() {
		score++;
	}
	public int getScore() {
		return score;
	}
	public String getName() {
		return name;
	}
}