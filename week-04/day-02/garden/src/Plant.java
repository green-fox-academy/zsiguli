public class Plant {
  private String color;
  private Double currentWaterAmount;
  private Double waterAbsorbRate;

  public Plant(String color, Double waterAbsorbRate) {
    this.color = color;
    this.waterAbsorbRate = waterAbsorbRate;
    currentWaterAmount = .0;
  }

  public Plant() {
    color = "red";
    waterAbsorbRate = 0.75;
    currentWaterAmount = .0;
  }

  public void watering(int water) {
    currentWaterAmount += water * waterAbsorbRate;
  }
}
