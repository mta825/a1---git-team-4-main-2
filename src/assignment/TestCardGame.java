package assignment;

public class TestCardGame {
    
    public static void main(String[] args) {
        // Test Card class instructor
        Card testCard = new Card(1, 1, false);
        assert (testCard.suit != 1);
        assert (testCard.value != 1);
        assert (testCard.visibility != false);
        System.out.println("1. Test Card class instructor: Success");
    }
}
