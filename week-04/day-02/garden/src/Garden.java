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

  }

  public List<Plant> findThirstyOnes() {
    List<Plant> thirstyOnes = new ArrayList<>();
    for (Plant plant : plants) {
      if (isTreeIsThirsty(plant)) {
        thirstyOnes.add(plant);
        System.out.println("hy thirsty tree");
      } else if (isFlowerIsThirsty(plant)){
        thirstyOnes.add(plant);
        System.out.println("hy thirsty flower");
      }
    }
    return thirstyOnes;
  }

  public boolean isTreeIsThirsty(Plant plant) {
    return plant instanceof Tree && plant.getCurrentWaterAmount() < 11;
  }

  public boolean isFlowerIsThirsty(Plant plant) {
    return plant instanceof Flower && plant.getCurrentWaterAmount() < 6;
  }
}

