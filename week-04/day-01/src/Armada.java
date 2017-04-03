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

  public boolean war(Armada enemyArmada) {
    int i = 0;
    int j = 0;
    Ship ship1;
    Ship ship2;
    while (true) {
      try {
        ship1 = ships.get(i);
      } catch (IndexOutOfBoundsException e) {
        return false;
      }
      try {
        ship2 = enemyArmada.ships.get(j);
      } catch (IndexOutOfBoundsException e) {
        return true;
      }

      if (ship1.battle(ship2)) {
        ++j;
      } else {
        ++i;
      }
    }
  }
}

