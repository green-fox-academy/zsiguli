import java.util.ArrayList;
import java.util.List;

public class Pirates {
  static int birthCounter;
  static List<Pirates> alreadyBornPirates = new ArrayList<>();

  String name;
  int rumCounter;
  int id;
  boolean alive;

  public Pirates(String name) {
    this.id = birthCounter;
    rumCounter = 0;
    alive = true;

    this.name = name;

    alreadyBornPirates.add(this);
    birthCounter++;
  }

  public Pirates() {
    this.id = birthCounter;
    rumCounter = 0;
    alive = true;

    this.name = "Jack";

    alreadyBornPirates.add(this);
    birthCounter++;
  }

  public static void drinkSomeRum(Pirates pirate, int rum) {
    if (pirate.alive) {
      pirate.rumCounter = pirate.rumCounter + rum;
    } else {
      System.out.println("he's dead");
    }
  }

  public static void drinkSomeRum(Pirates pirate) {
    if (pirate.alive) {
      pirate.rumCounter++;
    } else {
      System.out.println("he's dead");
    }
  }

  public static void drinkSomeRum() {
    for (Pirates pirate : alreadyBornPirates) {
      if (pirate.alive) {
        pirate.rumCounter++;
      } else {
        System.out.println("he's dead");
      }
    }
  }

  public static void howsItGoingMate(Pirates pirate) {
    if (pirate.alive) {
      if (pirate.rumCounter < 5) {
        System.out.println("Pour me anudder!");
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        pirate.rumCounter = 0;
      }
    } else {
      System.out.println("he's dead");
    }
  }

  public static void die(Pirates pirate) {
    pirate.alive = false;
  }

  public static void brawl(Pirates pir1, Pirates pir2) {
    if (pir1.alive && pir2.alive) {
      int winner = (int) (Math.random() * 4);
      System.out.println(winner);
      switch (winner) {
        case 0:
          pir1.rumCounter = 0;
          pir2.rumCounter = 0;
          break;
        case 1:
          die(pir2);
          break;
        case 2:
          die(pir1);
          break;
      }
    } else {
      System.out.println("oops someone is dead");
    }
  }

  public static void main(String[] args) {
    Pirates pirate1 = new Pirates("Joe");
    Pirates pirate2 = new Pirates();
    die(pirate2);
    die(pirate1);
    drinkSomeRum();
    drinkSomeRum(pirate1);
    drinkSomeRum(pirate2, 6);
    System.out.println(pirate1.name + " " + pirate1.id + " " + pirate1.rumCounter + " " + pirate1.alive);
    System.out.println(pirate2.name + " " + pirate2.id + " " + pirate2.rumCounter + " " + pirate2.alive);
    brawl(pirate1, pirate2);
    howsItGoingMate(pirate1);
    System.out.println(pirate1.name + " " + pirate1.id + " " + pirate1.rumCounter + " " + pirate1.alive);
    howsItGoingMate(pirate2);
    System.out.println(pirate2.name + " " + pirate2.id + " " + pirate2.rumCounter + " " + pirate2.alive);
  }
}
