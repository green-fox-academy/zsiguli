public class GardenerApp {
  public static void main(String[] args) {
    Plant flower1 = new Flower("yellow");
    Plant flower2 = new Flower("blue");
    Plant tree1 = new Tree("purple");
    Plant tree2 = new Tree("orange");
    Garden garden = new Garden();
    garden.plant(flower1);
    garden.plant(flower2);
    garden.plant(tree1);
    garden.plant(tree2);
    System.out.println(garden.waterState());
    garden.water(40);
    System.out.println(garden.waterState());
    garden.water(70);
    System.out.println(garden.waterState());
  }
}
