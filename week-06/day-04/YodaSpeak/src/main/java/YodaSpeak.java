import java.util.Scanner;

public class YodaSpeak {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String sentence = scanner.nextLine().replace(" ", "+");
    String URLLink = "https://yoda.p.mashape.com/yoda?sentence=" + sentence;
    System.out.println(URLLink);
  }
}
