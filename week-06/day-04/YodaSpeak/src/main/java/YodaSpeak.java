import java.net.URL;
import java.util.Scanner;

public class YodaSpeak {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    String inputSentence = scanner.nextLine().replace(" ", "+");
    String URLLink = "https://yoda.p.mashape.com/yoda?sentence=" + inputSentence;
    URL url = new URL(URLLink);
    System.out.println(URLLink);
  }
}
