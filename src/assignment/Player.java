import java.util.ArrayList;

public class Player {
    ArrayList<Hand> hands;
    ArrayList<Deck> decks;
    public addHand(Hand newHand) {
        hands.add(newHand);
    }
    public addDeck(Deck newDeck) {
        decks.add(newDeck);
    }
    public printCards() {
        System.out.println("Hands");
        for (int i=0; i<hands.length(); i++) {
            ArrayList<Card> cards = hands[i].getCards(this);
            for (int j=0; j<cards.length(); j++) {
                System.out.printf("Hand %d %d of %d",i,cards[j].suit,cards[j].value);
            }
        }
        System.out.println("Decks");
        for (int i=0; i<decks.length(); i++) {
            ArrayList<Card> cards = decks[i].getCards(this);
            for (int j=0; j<cards.length(); j++) {
                System.out.printf("Deck %d %d of %d",i,cards[j].suit,cards[j].value);
            }
        }
    }
}