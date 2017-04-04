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
      if (plant instanceof Tree && plant.getCurrentWaterAmount() < 11) {
        thirstyOnes.add(plant);
        System.out.println("hy thirsty tree");
      } else if (plant instanceof Flower && plant.getCurrentWaterAmount() < 6){
        thirstyOnes.add(plant);
        System.out.println("hy thirsty flower");
      }
    }
    return thirstyOnes;
  }
}

