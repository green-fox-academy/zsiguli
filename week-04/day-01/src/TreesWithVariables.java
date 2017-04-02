import java.util.ArrayList;
import java.util.List;

public class TreesWithVariables {
  static List<String> types = new ArrayList<>();
  static List<String> leafColors = new ArrayList<>();
  static List<Long> ages = new ArrayList<>();
  static List<String> sexes = new ArrayList<>();

  public static void main(String[] args) {
    newTree("A", "red", 15, "male");
    newTree("B", "yellow", 1506, "male");
    newTree("C", "green", 156, "female");
    newTree("D", "blue", 4615, "male");
    newTree("E", "purple", 185, "female");
    printTreeData("A");
  }

  public static void newTree(String type, String leafColor, long age, String sex) {
    types.add(type);
    leafColors.add(leafColor);
    ages.add(new Long(age));
    sexes.add(sex);
  }

  public static void printTreeData(String type) {
    int index = types.indexOf(type);
    System.out.println("Type: " + types.get(index) + "\n" +
            "Leaf color: " + leafColors.get(index) + "\n" +
            "Age: " + ages.get(index) + "\n" +
            "Sex: " + sexes.get(index));
  }
}
