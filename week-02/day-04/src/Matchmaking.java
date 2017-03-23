import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by markovich on 2017.03.23..
 */
public class Matchmaking {
  public static void main(String[] args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));
    ArrayList<String> order = new ArrayList<String>();

    System.out.println(boysOrder(boys, girlsOrder(girls, order)));
  }
  public static ArrayList<String> girlsOrder(ArrayList<String> girls, ArrayList<String > order) {
    for (int i = 0; i < girls.size(); i++) {
      order.add(i, girls.get(i));
    }
  return order;
  }
  public static ArrayList<String> boysOrder(ArrayList<String> boys, ArrayList<String > order) {
    int counter = 0;
    for (int i = 1; i < boys.size(); i += 2) {
      order.add(i, boys.get(counter++));
    }
    return order;
  }
}
