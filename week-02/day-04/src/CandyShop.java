import java.util.ArrayList;

/**
 * Created by markovich on 2017.03.23..
 */
public class CandyShop {
  public static void main(String[] args) {
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);

    for (int i = 0; i < arrayList.size(); i++) {
      String testValue = "";
      if (arrayList.get(i).getClass() != testValue.getClass() ) {
        if (i == 1) {
          arrayList.set(i, "Croissant");
        }
        else {
          arrayList.set(i, "Ice cream");
        }
      }
    }
    System.out.println(arrayList);
  }
}
