public class Parrot {
  String color;
  String name;

  public Parrot() {
    color = "unknown";
    name = "unknown";
  }

  public Parrot(String name) {
    this.name = name;
  }

  public Parrot(String name, String color) {
    this.name = name;
    this.color = color;
  }
}
