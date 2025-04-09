package project;

public class Card {
		// Fields
		
		// Value (contains a value from 2-14 representing cards 2-Ace)
		int value = 0;
		// Name (e.g. Ace of Diamonds, or Two of Hearts)
		String name = "";
		
		// Methods
		
		// Getters and setters
		public int getValue() {	// get value of the card	
			return value;
		}
		public String getName() { // get name of the card
			return name;
		}
		public void setValue(int newValue) { // set value of the card
			value = newValue;
		}
		public void setName(String newName) { // set name of the card
			name = newName;
		}
		// Describe (prints out information about card)
		public void describe() {
			System.out.println("Your card is " + name + "with the value " + value);
		}
		// Constructor for card class
		public Card(String name, int value) {
			this.name = name;
			this.value = value;
		}
	}
