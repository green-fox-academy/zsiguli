import java.util.ArrayList;
import java.util.List;

public class Armada {
  List<Ship> ships = new ArrayList<>();

  public void fillArmada() {
    int shipNumber = (int) (Math.random() * 20);
    for (int i = 0; i < shipNumber; ++i) {
      Ship ship = new Ship();
      ship.fillShip();
      ships.add(ship);
    }
  }
}
