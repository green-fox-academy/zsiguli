import java.util.ArrayList;
import java.util.List;

public class Pirates {
  static int birthCounter;
  static List<Pirates> alreadyBornPirates = new ArrayList<>();

  String name;
  int rumCounter;
  int id;

  public Pirates(String name) {
    this.id = birthCounter;
    rumCounter = 0;

    this.name = name;

    alreadyBornPirates.add(this);
    birthCounter++;
  }

  public Pirates() {
    this.id = birthCounter;
    rumCounter = 0;

    this.name = "Jack";

    alreadyBornPirates.add(this);
    birthCounter++;
  }

  public static void drinkSomeRum(Pirates pirate, int rum) {
    pirate.rumCounter = pirate.rumCounter + rum;
  }

  public static void drinkSomeRum(Pirates pirate) {
    pirate.rumCounter++;
  }

  public static void drinkSomeRum() {
    for (Pirates pirate : alreadyBornPirates) {
      pirate.rumCounter++;
    }
  }

  public static void howsItGoingMate(Pirates pirate) {
    if (pirate.rumCounter < 5) {
      System.out.println("Pour me anudder!");
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      pirate.rumCounter = 0;
    }
  }

  public static void main(String[] args) {
    Pirates pirate1 = new Pirates("Joe");
    Pirates pirate2 = new Pirates();
    drinkSomeRum();
    drinkSomeRum(pirate1);
    drinkSomeRum(pirate2, 6);
    System.out.println(pirate1.name +  " " + pirate1.id + " " + pirate1.rumCounter);
    System.out.println(pirate2.name +  " " + pirate2.id + " " + pirate2.rumCounter);
    howsItGoingMate(pirate1);
    System.out.println(pirate1.name +  " " + pirate1.id + " " + pirate1.rumCounter);
    howsItGoingMate(pirate2);
    System.out.println(pirate2.name +  " " + pirate2.id + " " + pirate2.rumCounter);
  }
}
