import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
  public static void main(String[] args) {
    List<Car> randomlyCreatedCars = createRandomCars(256);
    printCarTypesAndOccurrences(randomlyCreatedCars);
    Map<Color, Integer> colorOccurrences = new HashMap<>();
    for (Car car : randomlyCreatedCars) {
      if (colorOccurrences.get(car.getColor()) == null) {
        colorOccurrences.put(car.getColor(), 1);
      } else {
        int thing = colorOccurrences.get(car.getColor());
        colorOccurrences.put(car.getColor(), ++thing);
      }
    }


    for (int i = 0; i < colorOccurrences.size(); ++i) {
      System.out.println(Color.values()[i] + ": " + colorOccurrences.get(Color.values()[i]));
    }
  }

  public static List<Car> createRandomCars(long numberOfCarsToCreate) {
    List<Car> randomlyCreatedCars = new ArrayList<>();
    for (int i = 0; i < numberOfCarsToCreate; ++i) {
      randomlyCreatedCars.add(new Car());
    }
    return randomlyCreatedCars;
  }

  public static void getCarTypesAndOccurrences(List<Car> cars) {
    Map<Type, Integer> typeOccurrences = new HashMap<>();
    for (Car car : cars) {
      if (typeOccurrences.get(car.getType()) == null) {
        typeOccurrences.put(car.getType(), 1);
      } else {
        int actualOccurrences = typeOccurrences.get(car.getType());
        typeOccurrences.put(car.getType(), ++actualOccurrences);
      }
    }
    for (int i = 0; i < typeOccurrences.size(); ++i) {
      System.out.println(Type.values()[i] + ": " + typeOccurrences.get(Type.values()[i]));
    }
  }
}
