public class Plant {
  private String color;
  private Double currentWaterAmount;
  private Double waterAbsorbRate;

  public Plant(String color, Double waterAbsorbRate) {
    this.color = color;
    this.waterAbsorbRate = waterAbsorbRate;
    currentWaterAmount = .0;
  }

  public Plant(String color) {
    this.color = color;
    waterAbsorbRate = .5;
    currentWaterAmount = .0;
  }

  public Plant() {
    color = "red";
    waterAbsorbRate = .5;
    currentWaterAmount = .0;
  }

  public Double getWaterAbsorbRate() {
    return waterAbsorbRate;
  }

  public Double getCurrentWaterAmount() {
    return currentWaterAmount;
  }

  public void setCurrentWaterAmount(Double currentWaterAmount) {
    this.currentWaterAmount = currentWaterAmount;
  }

  public String getColor() {
    return color;
  }
}
