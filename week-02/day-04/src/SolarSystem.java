import java.util.*;
/**
 * Created by markovich on 2017.03.23..
 */
public class SolarSystem {
  public static void main(String[] args) {
    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

    planetList.add(5, "Saturn");
    System.out.println(planetList);

  }
}
