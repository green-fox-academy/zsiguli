import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
  public static void main(String[] args) {
    List<Car> randomlyCreatedCars = createRandomCars(256);
    Map<Type, Integer> carTypeOccurrences = getCarTypeOccurrences(randomlyCreatedCars);
    Map<Color, Integer> carColorOccurrences = getCarColorOccurrences(randomlyCreatedCars);
    printOccurrences(carTypeOccurrences);
    printOccurrences(carColorOccurrences);

    int[][] allTheCars = new int[Type.values().length][Color.values().length];
    for (Car car : randomlyCreatedCars) {
      allTheCars[car.getType().getValue()][car.getColor().getValue()] += 1;
    }
    String mostPopularOne = new String();
    int maxOccurrence = 0;
    for (int i = 0; i < allTheCars.length; ++i) {
      for (int j = 0; j < allTheCars[i].length; ++j) {
        int temp = allTheCars[i][j];
        if (temp > maxOccurrence) {
          mostPopularOne = Color.values()[j] + " " + Type.values()[i];
          maxOccurrence = temp;
        }
      }
    }
    System.out.println(mostPopularOne);
  }

  public static List<Car> createRandomCars(long numberOfCarsToCreate) {
    List<Car> randomlyCreatedCars = new ArrayList<>();
    for (int i = 0; i < numberOfCarsToCreate; ++i) {
      randomlyCreatedCars.add(new Car());
    }
    return randomlyCreatedCars;
  }

  public static Map<Type, Integer> getCarTypeOccurrences(List<Car> cars) {
    Map<Type, Integer> typeOccurrences = new HashMap<>();
    for (Car car : cars) {
      if (typeOccurrences.get(car.getType()) == null) {
        typeOccurrences.put(car.getType(), 1);
      } else {
        int actualOccurrences = typeOccurrences.get(car.getType());
        typeOccurrences.put(car.getType(), ++actualOccurrences);
      }
    }
    return typeOccurrences;
  }

  public static Map<Color, Integer> getCarColorOccurrences(List<Car> cars) {
    Map<Color, Integer> colorOccurrences = new HashMap<>();
    for (Car car : cars) {
      if (colorOccurrences.get(car.getColor()) == null) {
        colorOccurrences.put(car.getColor(), 1);
      } else {
        int thing = colorOccurrences.get(car.getColor());
        colorOccurrences.put(car.getColor(), ++thing);
      }
    }
    return colorOccurrences;
  }

  public static <T> void printOccurrences(Map<T, Integer> typeOccurrences) {
    for (int i = 0; i < typeOccurrences.size(); ++i) {
      Object actual = typeOccurrences.keySet().toArray()[i];
      System.out.println(actual + ": " + typeOccurrences.get(actual));
    }
    System.out.println();
  }
}
