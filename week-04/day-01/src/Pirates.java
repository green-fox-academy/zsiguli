public class Pirates {
  static int birthCounter;

  String name;
  int rumCounter;
  int id;

  public Pirates(String name) {
    this.id = birthCounter;
    rumCounter = 0;

    this.name = name;

    birthCounter++;
  }

  public Pirates() {
    this.id = birthCounter;
    rumCounter = 0;

    this.name = "Jack";

    birthCounter++;
  }

  public static void drinkSomeRum(Pirates pirate, int rum) {
    pirate.rumCounter = pirate.rumCounter + rum;
  }

  public static void drinkSomeRum(Pirates pirate) {
    pirate.rumCounter++;
  }

  public static void main(String[] args) {
    Pirates pirate1 = new Pirates("Joe");
    Pirates pirate2 = new Pirates();
    drinkSomeRum(pirate1);
    drinkSomeRum(pirate2, 9);
    System.out.println(pirate1.name +  " " + pirate1.id + " " + pirate1.rumCounter);
    System.out.println(pirate2.name +  " " + pirate2.id + " " + pirate2.rumCounter);
  }
}