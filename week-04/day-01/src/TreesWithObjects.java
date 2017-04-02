public class TreesWithObjects {
  public static void main(String[] args) {
    Tree tree1 = new Tree("A", "red", 758, "male");
  }
}

class Tree {
  static String type;
  static String leafColor;
  static long age;
  static String sex;

  public Tree(String type, String leafColor, long age, String sex) {
    this.type = type;
    this.leafColor = leafColor;
    this.age = age;
    this.sex = sex;
  }
}
