/**
 * Created by markovich on 2017.03.23..
 */
public class Reverse {
  public static void main(String[] args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    System.out.println(reverser(stringToBuilder(reversed)));
  }

  public static StringBuilder reverser(StringBuilder str) {
    for (int i = 0; i < str.length() / 2; i++ ) {
      char temp = str.charAt(i);
      str.setCharAt(i, str.charAt(str.length()-1-i));
      str.setCharAt(str.length() - 1 - i, temp );
    }
    return str;
  }

  public static StringBuilder stringToBuilder(String str) {
    StringBuilder strB = new StringBuilder();
    strB.append(str);
    return strB;
  }
}
