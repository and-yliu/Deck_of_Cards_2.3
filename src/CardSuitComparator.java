import java.util.Comparator;
public class CardSuitComparator implements Comparator<Card>{
    @Override
    public int compare(Card o1, Card o2) {
        int suitValue1 = suitValue(o1.getSuit());
        int suitValue2 = suitValue(o2.getSuit());
        if(suitValue1 < suitValue2){
            return 1;
        }
        else if (suitValue1 > suitValue2) {
            return -1;
        }
        return 0;
    }

    public int suitValue(Suit suit){
        if (suit == Suit.SPADES){
            return 4;
        }
        else if (suit == Suit.HEARTS) {
            return 3;
        }
        else if (suit == Suit.CLUBS){
            return 2;
        }
        else if (suit == Suit.DIAMONDS){
            return 1;
        }
        return 0;
    }
}
