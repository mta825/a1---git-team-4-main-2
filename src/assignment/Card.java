package assignment;

public class Card {
    private int suit; // "1: Hearts", "2 :Diamonds", "3: Clubs", "4: Spades"
    private int value; // 1-13
    private boolean visiblity; // false = face down, true = face up

    public Card(int suit, int value) {
        this.suit = suit;
        this.value = value;
        visiblity = false;
    }

    // Getters

    public int getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public boolean getVisiblity() {
        return visiblity;
    }

    // Setters

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setVisiblity(boolean visiblity) {
        this.visiblity = visiblity;
    }

}