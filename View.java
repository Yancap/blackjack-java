import java.util.ArrayList;

public class View {
  public static void homeScreen(){
    System.out.println("________________________________");
    System.out.println("|||||||    BLACK JACK    |||||||");
    System.out.println("--------------------------------");
    System.out.println("                         _\r\n" + //
        " ,'`.    _  _    /\\    _(_)_\r\n" + //
        "(_,._)  ( `' )  <  >  (_)+(_)\r\n" + //
        "  /\\     `.,'    \\/      |");
    System.out.println("\nSeja bem-vindo!!!\n");
    System.out.print("Aperte ENTER para continuar >> ");
    Input.in.nextLine();
  }

  public static void card(Card card){

    if(!card.getIsTurn()) {
      System.out.println(" _____");
      System.out.println( "|\\ ~ /|");
      System.out.println("|}}:{{|");
      System.out.println("|}}:{{|");
      System.out.println("|}}:{{|");
      System.out.println( "|/_~_\\|");
      return;
    }

    var name = card.name == "As" ? "A" : 
    card.name == "Rei" ? "K" : 
    card.name == "Rainha" ? "Q" : 
    card.name == "Valete" ? "J" : card.name;

    var type = card.type == "Espadas" ? "{>" :
    card.type == "Copas" ? "<3" : 
    card.type == "Ouros" ? "<>" : "-%";

    String[][] points = new String[][] { {" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};

    switch (card.getPontuation()) {
      case 2:
        points[0][1] = "^";
        points[2][1] = "^";
        break;
      case 3:
        points[0][0] = "^";
        points[0][2] = "^";
        points[2][1] = "^";
        break;
      case 4:
        points[0][0] = "^";
        points[0][2] = "^";
        points[2][0] = "^";
        points[2][2] = "^";
        break;
      case 5:
        points[0][0] = "^";
        points[0][2] = "^";
        points[1][1] = "^";
        points[2][0] = "^";
        points[2][2] = "^";
        break;
      case 6:
        points[0][0] = "^";
        points[0][2] = "^";
        points[1][0] = "^";
        points[1][2] = "^";
        points[2][0] = "^";
        points[2][2] = "^";
        break;
      case 7:
        points[0][0] = "^";
        points[0][2] = "^";
        points[1][0] = "^";
        points[1][1] = "^";
        points[1][2] = "^";
        points[2][0] = "^";
        points[2][2] = "^";
        break;
      case 8:
        points[0][0] = "^";
        points[0][1] = "^";
        points[0][2] = "^";
        points[1][0] = "^";
        points[1][2] = "^";
        points[2][0] = "^";
        points[2][1] = "^";
        points[2][2] = "^";
        break;
      case 9:
      case 10:
        points[0][0] = "^";
        points[0][1] = "^";
        points[0][2] = "^";
        points[1][0] = "^";
        points[1][1] = "^";
        points[1][2] = "^";
        points[2][0] = "^";
        points[2][1] = "^";
        points[2][2] = "^";
        break;
      default:
        break;
    }

    if (name == "A"){
      switch (card.type) {
        case "Espadas":
          System.out.println(" _____");
          System.out.printf( "|A .  |\n");
          System.out.println("| /.\\ |");
          System.out.println("|(_._)|");
          System.out.println("|  |  |");
          System.out.printf( "|_____|\n");
          break;
        case "Copas":
          System.out.println(" _____");
          System.out.printf( "|A_ _ |\n");
          System.out.println("|( v )|");
          System.out.println("| \\ / |");
          System.out.println("|  .  |");
          System.out.printf( "|_____|\n");
          break;
        case "Ouros":
          System.out.println(" _____");
          System.out.printf( "|A ^  |\n");
          System.out.println("| / \\ |");
          System.out.println("| \\ / |");
          System.out.println("|  .  |");
          System.out.printf( "|_____|\n");
          break;
        default:
          System.out.println(" _____");
          System.out.printf( "|A _  |\n");
          System.out.println("| ( ) |");
          System.out.println("|(_'_)|");
          System.out.println("|  |  |");
          System.out.printf( "|_____|\n");
      }
    } else if (name == "10") {
      System.out.println(" _____");
      System.out.printf( "|%s ^ |\n", name);
      System.out.printf("|%s %s %s|\n", points[0][0], points[0][1], points[0][2]);
      System.out.printf("|%s %s %s|\n", points[1][0], points[1][1], points[1][2]);
      System.out.printf("|%s %s %s|\n", points[2][0], points[2][1], points[2][2]);
      System.out.printf( "|___%s|\n", type);
    } else if (card.getPontuation() == 10) {
      System.out.println(" _____");
      System.out.printf( "|%s  WW|\n", name);
      System.out.println("| ^ {)|");
      System.out.println("|(.)%%|");
      System.out.println("|  %%%|");
      System.out.printf( "|___%s|\n", type);
    } else {
      System.out.println(" _____");
      System.out.printf( "|%s    |\n", name);
      System.out.printf("|%s %s %s|\n", points[0][0], points[0][1], points[0][2]);
      System.out.printf("|%s %s %s|\n", points[1][0], points[1][1], points[1][2]);
      System.out.printf("|%s %s %s|\n", points[2][0], points[2][1], points[2][2]);
      System.out.printf( "|___%s|\n", type);
    }


  }
}
