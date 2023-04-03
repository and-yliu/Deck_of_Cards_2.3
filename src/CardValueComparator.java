import java.util.Comparator;
public class CardValueComparator implements Comparator<Card>{
    @Override
    public int compare(Card o1, Card o2) {
        int value1 = o1.getValue();
        int value2 = o2.getValue();
        if(value1 > value2){
            return 1;
        }
        else if (value1 < value2) {
            return -1;
        }
        return 0;
    }
}
