import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        ArrayList<Card> hand = deck.dealHand(7);
        System.out.println(hand);

        //Sort by Suit
        CardSuitComparator c1 = new CardSuitComparator();
        Collections.sort(hand, c1);
        System.out.println(hand);

        //Sort by Value
        CardValueComparator c2 = new CardValueComparator();
        Collections.sort(hand, c2);
        System.out.println(hand);
    }
}