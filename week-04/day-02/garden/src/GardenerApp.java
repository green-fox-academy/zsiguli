public class GardenerApp {
  public static void main(String[] args) {
    Garden garden = new Garden();
    garden.plant(new Flower("yellow"));
    garden.plant(new Flower("blue"));
    garden.plant(new Tree("purple"));
    garden.plant(new Tree("orange"));

    garden.waterState();
    garden.water(40);
    garden.waterState();
    garden.water(70);
    garden.waterState();
  }
}
