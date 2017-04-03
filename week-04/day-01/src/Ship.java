import java.util.ArrayList;
import java.util.List;

public class Ship {

  List<Pirates> originalCrewList = new ArrayList<>();
  Pirates captain;

  public void fillShip() {
    captain = new Pirates();
    int crewNumber = (int) (Math.random() * 100);
    for (int i = 0; i < crewNumber; ++i) {
      originalCrewList.add(new Pirates());
    }
  }

  public void stateOfShip() {
    List<Pirates> stillAlive = new ArrayList<>();
    for (Pirates pirate : originalCrewList) {
      if (pirate.alive) {
        stillAlive.add(pirate);
      }
    }
    System.out.println("rum consumed by the captain: " + captain.rumCounter + "\n" +
            "original crew number: " + originalCrewList.size() + "\n" +
            "still alive: " + stillAlive.size());
  }

  public void battle(Ship otherShip) {
    List<Pirates> stillAlive = new ArrayList<>();
    List<Pirates> stillAliveEnemies = new ArrayList<>();

    for (Pirates pirate : originalCrewList) {
      if (pirate.alive) {
        stillAlive.add(pirate);
      }
    }

    for (Pirates pirate : otherShip.originalCrewList) {
      if (pirate.alive) {
        stillAliveEnemies.add(pirate);
      }
    }
    int ownScore = captain.rumCounter + stillAlive.size();
    int enemyScore = otherShip.captain.rumCounter + stillAliveEnemies.size();

    int rumParty = (int) (Math.random() * 10);
    if (ownScore >= enemyScore) {
      captain.drinkMoreRum(2 * rumParty);
      for (Pirates pirate : stillAlive) {
        pirate.drinkMoreRum(rumParty);
      }
      for (int i = 0; i < (int) (Math.random() * stillAliveEnemies.size()); ++i) {
        stillAliveEnemies.get(i).alive = false;
      }
      System.out.println(true);
    } else {
      otherShip.captain.drinkMoreRum(2 * rumParty);
      for (Pirates pirate : stillAliveEnemies) {
        pirate.drinkMoreRum(rumParty);
      }
      for (int i = 0; i < (int) (Math.random() * stillAlive.size()); ++i) {
        stillAlive.get(i).alive = false;
      }
    }
  }
}
