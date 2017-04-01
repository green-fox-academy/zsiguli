import java.util.ArrayList;
import java.util.List;

public class TreesWithVariables {
  static List<String> Types = new ArrayList<>();
  static List<String> LeafColors = new ArrayList<>();
  static List<Long> Ages = new ArrayList<>();
  static List<String> Sexes = new ArrayList<>();

  public static void main(String[] args) {
    newTree("A", "red", 15, "male");
    newTree("B", "yellow", 1506, "male");
    newTree("C", "green", 156, "female");
    newTree("D", "blue", 4615, "male");
    newTree("E", "purple", 185, "female");
    printTreeData("A");
  }

  public static void newTree(String type, String leafColor, long age, String sex) {
    Types.add(type);
    LeafColors.add(leafColor);
    Ages.add(new Long(age));
    Sexes.add(sex);
  }

  public static void printTreeData(String type) {
    int index = Types.indexOf(type);
    System.out.println("Type: " + Types.get(index) + "\n" +
            "Leaf color: " + LeafColors.get(index) + "\n" +
            "Age: " + Ages.get(index) + "\n" +
            "Sex: " + Sexes.get(index));
  }
}
