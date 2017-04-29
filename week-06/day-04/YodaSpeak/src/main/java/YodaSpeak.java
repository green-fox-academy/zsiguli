import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class YodaSpeak {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    String inputSentence = scanner.nextLine().replace(" ", "+");
    String URLLink = "https://yoda.p.mashape.com/yoda?sentence=" + inputSentence;
    URL url = new URL(URLLink);
    HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
    connection.setRequestMethod("GET");
    connection.setRequestProperty("X-Mashape-Key", "r5OPgqayasmshVaxz6BXSWhRzbAnp148ckTjsnQnh2EBX7UADm");

    BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    StringBuffer sb = new StringBuffer();
    String line;

    while ((line = input.readLine()) != null) {
      sb.append(line);
    }
    input.close();
    System.out.println(sb);
  }
}
