import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> take(int numCards) {
        List<Card> takenCards = new ArrayList<Card>();
        for (int i = 0; i < numCards; i++) {
            if (cards.isEmpty()) {
                break;
            }
            takenCards.add(cards.remove(0));
        }
        return takenCards;
    }
}

enum Suit {
    HEARTS, DIAMONDS, CLUBS, SPADES;
}

enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
}

class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}