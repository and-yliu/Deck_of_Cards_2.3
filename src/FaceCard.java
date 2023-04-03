public class FaceCard extends Card {

    private Face face;
    public FaceCard(Suit suit, int value, Face face) {
        super(suit, value);
        this.face = face;
    }

    @Override
    public String toString() {
        return getSuit() + " " + getValue() + " " + face;
    }
}