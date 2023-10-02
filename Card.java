import java.util.Objects;

public class Card {
    public final String name;
    public final String type;
    private int pontuation;
    private boolean isTurn = true;

    public Card(String name, String type, int pontuation){
        this.name = name;
        this.type = type;
        this.pontuation = pontuation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(name, card.name) && Objects.equals(type, card.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }

    public int getPontuation() { return pontuation; }

    public void setPontuation(int point) {
        if (name == "As") {
            this.pontuation = point;
        }
    }
    public boolean getIsTurn() { return isTurn; }
    public Card turn() { isTurn = true; return this; }
    public Card untap() { isTurn = false; return this; }

}
