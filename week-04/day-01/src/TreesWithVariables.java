import java.util.ArrayList;
import java.util.List;

public class TreesWithVariables {
  static List<String> Types = new ArrayList<>();
  static List<String> LeafColors = new ArrayList<>();
  static List<Long> Ages = new ArrayList<>();
  static List<String> Sexes = new ArrayList<>();

  public static void main(String[] args) {

  }

  public static void newTree(String type, String leafColor, Long age, String sex) {
    Types.add(type);
    LeafColors.add(leafColor);
    Ages.add(age);
    Sexes.add(sex);
  }
}
