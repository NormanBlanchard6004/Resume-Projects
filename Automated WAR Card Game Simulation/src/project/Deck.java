package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
		// Fields
		
		// Cards (List of cards)
		List<Card> cards = new ArrayList<>();
		public void initializeDeck() {
			// Heart suite
			cards.add(new Card("Ace of Hearts", 14));
			cards.add(new Card("King of Hearts", 13));
			cards.add(new Card("Queen of Hearts", 12));
			cards.add(new Card("Jack of Hearts", 11));
			cards.add(new Card("Ten of Hearts", 10));
			cards.add(new Card("Nine of Hearts", 9));
			cards.add(new Card("Eight of Hearts", 8));
			cards.add(new Card("Seven of Hearts", 7));
			cards.add(new Card("Six of Hearts", 6));
			cards.add(new Card("Five of Hearts", 5));
			cards.add(new Card("Four of Hearts", 4));
			cards.add(new Card("Three of Hearts", 3));
			cards.add(new Card("Two of Hearts", 2));
			// Club suite
			cards.add(new Card("Ace of Clubs", 14));
			cards.add(new Card("King of Clubs", 13));
			cards.add(new Card("Queen of Clubs", 12));
			cards.add(new Card("Jack of Clubs", 11));
			cards.add(new Card("Ten of Clubs", 10));
			cards.add(new Card("Nine of Clubs", 9));
			cards.add(new Card("Eight of Clubs", 8));
			cards.add(new Card("Seven of Clubs", 7));
			cards.add(new Card("Six of Clubs", 6));
			cards.add(new Card("Five of Clubs", 5));
			cards.add(new Card("Four of Clubs", 4));
			cards.add(new Card("Three of Clubs", 3));
			cards.add(new Card("Two of Clubs", 2));
			// Spade suite
			cards.add(new Card("Ace of Spades", 14));
			cards.add(new Card("King of Spades", 13));
			cards.add(new Card("Queen of Spades", 12));
			cards.add(new Card("Jack of Spades", 11));
			cards.add(new Card("Ten of Spades", 10));
			cards.add(new Card("Nine of Spades", 9));
			cards.add(new Card("Eight of Spades", 8));
			cards.add(new Card("Seven of Spades", 7));
			cards.add(new Card("Six of Spades", 6));
			cards.add(new Card("Five of Spades", 5));
			cards.add(new Card("Four of Spades", 4));
			cards.add(new Card("Three of Spades", 3));
			cards.add(new Card("Two of Spades", 2));
			// Diamond suite
			cards.add(new Card("Ace of Diamonds", 14));
			cards.add(new Card("King of Diamonds", 13));
			cards.add(new Card("Queen of Diamonds", 12));
			cards.add(new Card("Jack of Diamonds", 11));
			cards.add(new Card("Ten of Diamonds", 10));
			cards.add(new Card("Nine of Diamonds", 9));
			cards.add(new Card("Eight of Diamonds", 8));
			cards.add(new Card("Seven of Diamonds", 7));
			cards.add(new Card("Six of Diamonds", 6));
			cards.add(new Card("Five of Diamonds", 5));
			cards.add(new Card("Four of Diamonds", 4));
			cards.add(new Card("Three of Diamonds", 3));
			cards.add(new Card("Two of Diamonds", 2));
		}
		public Deck() {
			initializeDeck(); // populate deck
			Collections.shuffle(cards); // shuffle deck using collections library
		}
		// Methods
		// Shuffle (shuffles cards)
		public void shuffle() {
			Collections.shuffle(cards);
		}
		// Draw (removes and returns the top card of the Cards field)
		public List<Card> draw() {
			List<Card> drawnCards = new ArrayList<>();
			drawnCards.add(cards.get(0));
			drawnCards.add(cards.get(1));
			cards.remove(0);
			cards.remove(0);
			// Reinitialize deck if cards run out
			if (cards.size() == 0) {
				initializeDeck();
				Collections.shuffle(cards);
			}
			return drawnCards;
		}
	}
