import java.util.LinkedList;
import java.util.ArrayList;

public class Deck {
    private LinkedList<Card> cards;
    public Deck() {
        cards = new LinkedList<>();
        for (Suit suit : Suit.values()) {
            for (int i = 1; i <= 10; i++) {
                cards.add(new NumberCard(suit, i));
            }
            for (int i = 11; i <= 13; i++) {
                Face face = null;
                if(i == 11){
                    face = Face.Jack;
                }
                else if (i == 12) {
                    face = Face.Queen;
                }
                else if (i == 13) {
                    face = Face.King;
                }
                cards.add(new FaceCard(suit, i, face));
            }
        }
    }

    public ArrayList<Card> dealHand(int numCards) {
        ArrayList<Card> hand = new ArrayList<>();
        for (int i = 1; i <= numCards; i++){
            int num = (int)(Math.random() * (52-i));
            hand.add(cards.get(num));
            cards.remove(num);
        }
        return hand;
    }
}