public class Plant {
  private String color;
  private Double currentWaterAmount;

  public Plant(String color) {
    this.color = color;
    currentWaterAmount = .0;
  }

  public Plant() {
    color = "red";
    currentWaterAmount = .0;
  }

  public Double getCurrentWaterAmount() {
    return currentWaterAmount;
  }

  public void increaseCurrentWaterAmount(Double amountOfWater) {
    this.currentWaterAmount += amountOfWater;
  }

  public String getColor() {
    return color;
  }

  public boolean isFlower() {
    return this instanceof Flower;
  }

  public boolean isTree() {
    return this instanceof Tree;
  }
}
