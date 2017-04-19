import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
  public static void main(String[] args) {
    List<Car> randomlyCreatedCars = createRandomCars(256);
    Map<Enum, Integer> typeAndColorOccurrences = new HashMap<>();
    for (Car car : randomlyCreatedCars) {
      if (typeAndColorOccurrences.get(car.getType()) == null) {
        typeAndColorOccurrences.put(car.getType(), 1);
      } else {
        int thing = typeAndColorOccurrences.get(car.getType());
        typeAndColorOccurrences.put(car.getType(), ++thing);
      }
      if (typeAndColorOccurrences.get(car.getColor()) == null) {
        typeAndColorOccurrences.put(car.getColor(), 1);
      } else {
        int thing = typeAndColorOccurrences.get(car.getColor());
        typeAndColorOccurrences.put(car.getColor(), ++thing);
      }
    }
    try {
      for (int i = 0; i < typeAndColorOccurrences.size(); ++i) {
        System.out.println(Type.values()[i] + ": " + typeAndColorOccurrences.get(Type.values()[i]));
      }
    } catch (ArrayIndexOutOfBoundsException ex) {

    }

    try {
      for (int i = 0; i < typeAndColorOccurrences.size(); ++i) {
        System.out.println(Color.values()[i] + ": " + typeAndColorOccurrences.get(Color.values()[i]));
      }
    } catch (ArrayIndexOutOfBoundsException ex) {

    }
  }

  public static List<Car> createRandomCars(long numberOfCarsToCreate) {
    List<Car> randomlyCreatedCars = new ArrayList<>();
    for (int i = 0; i < numberOfCarsToCreate; ++i) {
      randomlyCreatedCars.add(new Car());
    }
    return randomlyCreatedCars;
  }
}
