public class Program {
  public static void main(String[] args) {
    clean();
    Cards.init();
    var player = new Player();
    var dealer = new Dealer();
    String control = "";

    View.homeScreen();
    clean();
    while(!player.isStand) {
      clean();
      player.showCards();
      dealer.showCards();
      
      System.out.println("Deseja comprar ou parar?\n");
      System.out.println("hit -> comprar");
      System.out.println("stand -> parar");
      System.out.print(" >> ");
      control = Input.in.next().toLowerCase();
      Input.in.nextLine();
      System.out.println(control);
      if (control.equals("hit")) {
        player.hit();
      } else {
        player.stand();
      }
    }
    clean();
    player.chooseIfHaveAce();
    clean();
    dealer.getMoreUntilSeventeen();
    player.generateFinalScore();

    System.out.println("\nResultado Final");
    player.showCards();
    dealer.showCards();
    System.out.printf("Pontuacao final do jogador: %d \n", player.totalScore);
    System.out.printf("Pontuacao final do dealer: %d \n\n", dealer.getTotalScore());

    if (player.bust) {
      System.out.println("Sua pontuacao ultrapassou 21 pontos!");
      System.out.println("Voce Perdeu por BUST!");
    }else if (player.totalScore > dealer.getTotalScore()) {
      System.out.println("Sua pontuacao ficou acima do Dealer!");
      System.out.println("Voce Ganhou!");
    } else {
      System.out.println("Sua pontuacao ficou abaixo do Dealer!");
      System.out.println("Voce Perdeu!");
    }
  }

  public static void clean(){
    try {
      final String os = System.getProperty("os.name");
      
      if (os.contains("Windows")){
          new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      }
      else {
          String[] terminal = new String[] {"clean"};
          Runtime.getRuntime().exec(terminal);
      }
    }
    catch (final Exception e){
        System.out.println(e);
    }
  }
}
