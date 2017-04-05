public class Tree extends Plant {
  public Tree(String color) {
    super(color);
  }

  public Tree() {
    super("red");
  }

  @Override
  public void increaseCurrentWaterAmount(Double amountOfWater) {
    super.increaseCurrentWaterAmount(amountOfWater * .4);
  }
}
