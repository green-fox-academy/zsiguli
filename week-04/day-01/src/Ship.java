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
}
