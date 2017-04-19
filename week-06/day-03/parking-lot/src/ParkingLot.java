import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
  public static void main(String[] args) {
    List<Car> randomlyCreatedCars = new ArrayList<>();
    for (int i = 0; i < 256; ++i) {
      randomlyCreatedCars.add(new Car());
    }
  }
}
