import java.util.ArrayList;

public class Player {
    ArrayList<Hand> hands;
    ArrayList<Deck> decks;
    public void addHand(Hand newHand) {
        hands.add(newHand);
    }
    public void addDeck(Deck newDeck) {
        decks.add(newDeck);
    }
    public void printCards() {
        System.out.println("Hands");
        for (int i=0; i<hands.size(); i++) {
            ArrayList<Card> cards = hands.get(i).getCards();
            for (int j=0; j<cards.size(); j++) {
                System.out.printf("Hand %d %d of %d",i,cards.get(j).getSuit(),cards.get(j).getValue());
            }
        }
        System.out.println("Decks");
        for (int i=0; i<decks.size(); i++) {
            ArrayList<Card> cards = decks.get(i).getCards();
            for (int j=0; j<cards.size(); j++) {
                System.out.printf("Deck %d %d of %d",i,cards.get(j).getSuit(),cards.get(j).getValue());
            }
        }
    }
}