import java.util.*;
import java.util.random.*;

public class main {

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to the game! Have fun!");
    Player player = playersetup(scan);
    String[][] world = createWorld();

    int currentHealth = player.getCurrhealth();

    while (currentHealth > 0) {
      System.out.println("What would you like to do");
      System.out.println("1) Move");
      System.out.println("2) Heal [+ 15 to health]");

      String response = scan.nextLine();
      if (response.equals("Move")){
        System.out.println("You moved");
      }
      else if (response.equals("Heal")){
        System.out.println("You healed");
      }
    }
  }

  public static Player playersetup(Scanner scan){
    Player player = new Player();
    System.out.println("Let's set some things up. First, What is your name?");
    String name = scan.nextLine();
    player.setname(name);

    String namefromplayertest = player.getname();
    return player;
  }

  public static String[][] createWorld(){
    String[][] world = new String[5][];
    world[0] = new String[]{"O", "O", "O", "T", "O"};
    world[1] = new String[]{"O", "R", "O", "O", "O"};
    world[2] = new String[]{"O", "O", "R", "T", "O"};
    world[3] = new String[]{"O", "O", "O", "O", "O"};
    world[4] = new String[]{"O", "O", "R", "T", "O"};

    return world;
  }

  public static int battle(int currHealth){
    /// Add Enemy stats later
    int enemyHP = 100;
    while (currHealth > 0 && enemyHP > 0) {

    }

    if (enemyHP < 0) {
      int expGained = 20;
      System.out.println("You win! Exp gained");
    }

    return currHealth;
  }
}
