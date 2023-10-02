import java.util.ArrayList;
import java.util.List;

public class Dealer{

  protected List<Card> deckOfCards = new ArrayList<Card>();
  private int totalScore = 0;

  public Dealer(){
    deckOfCards.add(Cards.getCard());
    deckOfCards.add(Cards.getCard().untap());
  }
  public void showCards(){
    System.out.println("-------------------------------------------------\n");
    System.out.println("Deck do Dealer\n");
    for (Card card : deckOfCards) {
      View.card(card);
      if (card.getIsTurn()) {
        System.out.printf("Pontuacao: %d\n\n", card.getPontuation());
        continue;
      }
      System.out.printf("Pontuacao: XXX\n\n");
    }
    System.out.println("-------------------------------------------------\n\n");
  }
  public void getMoreUntilSeventeen(){
    for (Card card : deckOfCards) {
      card.turn();
      totalScore += card.getPontuation();
    }
    while(totalScore <= 17) {
      Card card = Cards.getCard();
      totalScore += card.getPontuation();
      deckOfCards.add(card);
    }
  }
  public int getTotalScore() {
    return totalScore;
  }
}
