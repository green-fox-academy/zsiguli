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

  public void watering(int water) {
    currentWaterAmount += water;
  }
}
