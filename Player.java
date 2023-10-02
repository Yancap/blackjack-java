import java.util.ArrayList;
import java.util.List;

public class Player {
  private List<Card> deckOfCards = new ArrayList<>();
  public boolean isStand = false;
  public int totalScore = 0;
  public boolean bust = false;

  public Player(){
    deckOfCards.add(Cards.getCard());
    deckOfCards.add(Cards.getCard());
  }

  public void showCards(){
    System.out.println("-------------------------------------------------\n");
    System.out.println("Deck do Jogador\n");
    for (Card card : deckOfCards) {
      View.card(card);
      System.out.printf("Pontuacao: %d\n\n", card.getPontuation());
    }
    System.out.println("-------------------------------------------------\n\n");
  }

  public void hit(){
    deckOfCards.add(Cards.getCard());
  }
  public boolean stand(){
    this.isStand = true;
    return this.isStand;
  }
  public void generateFinalScore(){
    if (this.isStand) {
      for (Card card : deckOfCards) {
        totalScore += card.getPontuation();
      }
      if (totalScore > 21) {
        bust = true;
      }
    }
  }
  public void chooseIfHaveAce(){
    boolean haveAce = deckOfCards.stream().anyMatch(card -> card.name == "As");
    int pontuationForAce = 0;
    if (haveAce) {
      do {
        System.out.println("Deseja escolher entre 11 ou 1 para pontuacao do As?");
        pontuationForAce = Input.in.nextInt();
        System.out.println(pontuationForAce);
        Input.in.nextLine();
      } while (pontuationForAce != 1 && pontuationForAce != 11);
      for (Card card : deckOfCards) {
        card.setPontuation(pontuationForAce);
      }
    }

  }
}
