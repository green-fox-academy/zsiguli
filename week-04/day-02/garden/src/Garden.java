import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Plant> plants = new ArrayList<>();

  public List<Plant> getPlants() {
    return plants;
  }

  public void plant(Plant plant) {
    plants.add(plant);
  }

  public void water(double amountOfWater) {
    List<Plant> thirstyOnes = findThirstyOnes();
    Double waterForOne = howManyWater(thirstyOnes, amountOfWater);
    for (Plant thirstyPlant : thirstyOnes) {
      thirstyPlant.increaseCurrentWaterAmount(waterForOne);
    }
  }

  public List<Plant> findThirstyOnes() {
    List<Plant> thirstyOnes = new ArrayList<>();
    for (Plant plant : plants) {
      if (isThirsty(plant)) {
        thirstyOnes.add(plant);
      }
    }
    return thirstyOnes;
  }

  public boolean isTree(Plant plant) {
    return plant instanceof Tree;
  }

  public boolean isFlower(Plant plant) {
    return plant instanceof Flower;
  }

  public boolean isThirsty(Plant plant) {
    if (isFlower(plant)) {
      return plant instanceof Flower && plant.getCurrentWaterAmount() < 6;
    } else if (isTree(plant)) {
      return plant instanceof Tree && plant.getCurrentWaterAmount() < 11;
    } else {
      return false;
    }
  }

  public double howManyWater(List<Plant> thirstyOnes, Double fullAmountOfWater) {
    return fullAmountOfWater / thirstyOnes.size();
  }

  public String waterState() {
    String waterState = new String();
    for (Plant plant : plants) {
      String plantType;
      if (isTree(plant)) {
        plantType = " Tree";
      } else {
        plantType = " Flower";
      }
      if (isThirsty(plant)) {
        waterState += "The " + plant.getColor() + plantType + " needs water \n";
      } else {
        waterState += "The " + plant.getColor() + plantType + " doesn't needs water \n";
      }
    }
    return waterState;
  }
}

