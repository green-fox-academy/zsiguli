public class Flower extends Plant {
  public Flower(String color) {
    super(color);
  }

  public Flower() {
    super("red");
  }

  @Override
  public void increaseCurrentWaterAmount(Double amountOfWater) {
    super.increaseCurrentWaterAmount(amountOfWater * .75);
  }
}
