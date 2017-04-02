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

  public static void main(String[] args) {
    Pirates pirate1 = new Pirates("Joe");
    Pirates pirate2 = new Pirates();
    System.out.println(pirate1.name +  " " + pirate1.id + " " + pirate1.rumCounter);
    System.out.println(pirate2.name +  " " + pirate2.id + " " + pirate2.rumCounter);
  }
}