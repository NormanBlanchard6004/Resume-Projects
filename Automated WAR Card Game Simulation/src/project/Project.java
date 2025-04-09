package project;

public class Project {

	public class App {
		public static void main(String[] args) {
			
		
		// Instantiate a Deck and two Players, call the shuffle method on the deck.
		Deck newDeck = new Deck();
		Player p1 = new Player("Player 1");
		Player p2 = new Player("Player 2");
		// Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
		for (int i = 0; i < 52; i++) {
			// Add drawn cards to player's hands
			p1.draw(newDeck);
			p2.draw(newDeck);
		}
		// Using a traditional for loop, iterate 26 times and call the flip method for each player.
		for (int i = 0; i < 26; i++) {
			// Each player flips a card
			Card cardP1 = p1.flip();
			Card cardP2 = p2.flip();
		
			// Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
			if (cardP1.getValue() > cardP2.getValue()) {
				p1.incrementScore();
				System.out.println("Round " + (i + 1) + ": " + p1.getName() + " wins this round with " + cardP1.getName());
			} else if (cardP1.getValue() < cardP2.getValue()) {
				p2.incrementScore();
				System.out.println("Round " + (i + 1) + ": " + p2.getName() + " wins this round with " + cardP2.getName());
			} else {
				System.out.println("Round " + (i + 1) + ": It's a draw! No points awarded.");
			}
		}
		// After the loop, compare the final score from each player.
		
		// Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
			System.out.println("\nFinal Scores: ");
			System.out.println(p1.getName() + ": " + p1.getScore());
			System.out.println(p2.getName() + ": " + p2.getScore());
			
			if (p1.getScore() > p2.getScore()) {
				System.out.println(p1.getName() + " wins!");
			} else if (p1.getScore() < p2.getScore()) {
				System.out.println(p2.getName() + " wins!");
			} else {
				System.out.println("It's a Draw!");
			}
		}
	}
}

