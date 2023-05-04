import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {   

        Deck deck = new Deck();
        deck.shuffle();
        List<Card> hand = deck.take(5);
        System.out.println("Your hand: " + hand.toString());

    }
}
