import java.util.ArrayList;
import java.util.List;

public class Ship {

  List<Pirates> crewList = new ArrayList<>();
  Pirates captain;

  public void fillShip() {
    captain = new Pirates();
    int crewNumber = (int) (Math.random() * 100);
    for (int i = 0; i < crewNumber; ++i) {
      crewList.add(new Pirates());
    }
  }

  public void stateOfShip() {
    List<Pirates> stillAlive = new ArrayList<>();
    for (Pirates pirate : crewList) {
      if (pirate.alive) {
        stillAlive.add(pirate);
      }
    }
    System.out.println("rum consumed by the captain: " + captain.rumCounter + "\n" +
            "original crew number: " + crewList.size() + "\n" +
            "still alive: " + stillAlive.size());
  }
}
