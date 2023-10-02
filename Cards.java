import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cards {
    public static List<Card> deckOfAllCards = new ArrayList<>();

    public static void init(){
        List<Card> auxDeck = new ArrayList<>();
        auxDeck.add(new Card("As", "Espadas", 11));
        auxDeck.add(new Card("As", "Copas", 11));
        auxDeck.add(new Card("As", "Ouros", 11));
        auxDeck.add(new Card("As", "Paus", 11));
        auxDeck.add(new Card("Rei", "Espadas", 10));
        auxDeck.add(new Card("Rei", "Copas", 10));
        auxDeck.add(new Card("Rei", "Ouros", 10));
        auxDeck.add(new Card("Rei", "Paus", 10));
        auxDeck.add(new Card("Rainha", "Espadas", 10));
        auxDeck.add(new Card("Rainha", "Copas", 10));
        auxDeck.add(new Card("Rainha", "Ouros", 10));
        auxDeck.add(new Card("Rainha", "Paus", 10));
        auxDeck.add(new Card("Valete", "Espadas", 10));
        auxDeck.add(new Card("Valete", "Copas", 10));
        auxDeck.add(new Card("Valete", "Ouros", 10));
        auxDeck.add(new Card("Valete", "Paus", 10));
        auxDeck.add(new Card("10", "Espadas", 10));
        auxDeck.add(new Card("10", "Copas", 10));
        auxDeck.add(new Card("10", "Ouros", 10));
        auxDeck.add(new Card("10", "Paus", 10));
        auxDeck.add(new Card("9", "Espadas", 9));
        auxDeck.add(new Card("9", "Copas", 9));
        auxDeck.add(new Card("9", "Ouros", 9));
        auxDeck.add(new Card("9", "Paus", 9));
        auxDeck.add(new Card("8", "Espadas", 8));
        auxDeck.add(new Card("8", "Copas", 8));
        auxDeck.add(new Card("8", "Ouros", 8));
        auxDeck.add(new Card("8", "Paus", 8));
        auxDeck.add(new Card("7", "Espadas", 7));
        auxDeck.add(new Card("7", "Copas", 7));
        auxDeck.add(new Card("7", "Ouros", 7));
        auxDeck.add(new Card("7", "Paus", 7));
        auxDeck.add(new Card("6", "Espadas", 6));
        auxDeck.add(new Card("6", "Copas", 6));
        auxDeck.add(new Card("6", "Ouros", 6));
        auxDeck.add(new Card("6", "Paus", 6));
        auxDeck.add(new Card("5", "Espadas", 5));
        auxDeck.add(new Card("5", "Copas", 5));
        auxDeck.add(new Card("5", "Ouros", 5));
        auxDeck.add(new Card("5", "Paus", 5));
        auxDeck.add(new Card("4", "Espadas", 4));
        auxDeck.add(new Card("4", "Copas", 4));
        auxDeck.add(new Card("4", "Ouros", 4));
        auxDeck.add(new Card("4", "Paus", 4));
        auxDeck.add(new Card("3", "Espadas", 3));
        auxDeck.add(new Card("3", "Copas", 3));
        auxDeck.add(new Card("3", "Ouros", 3));
        auxDeck.add(new Card("3", "Paus", 3));
        auxDeck.add(new Card("2", "Espadas", 2));
        auxDeck.add(new Card("2", "Copas", 2));
        auxDeck.add(new Card("2", "Ouros", 2));
        auxDeck.add(new Card("2", "Paus", 2));

        Random random = new Random();
        while (0 < auxDeck.size()) {
            int index = random.nextInt(auxDeck.size());
            deckOfAllCards.add(auxDeck.remove(index));
        }
    }

    public static Card getCard() {
        Random random = new Random();
        int index = random.nextInt(deckOfAllCards.size());
        return deckOfAllCards.remove(index);
    }

    public static int deckLength() {
        return deckOfAllCards.size();
    }
}
