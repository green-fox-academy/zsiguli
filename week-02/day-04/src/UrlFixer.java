/**
 * Created by markovich on 2017.03.23..
 */
public class UrlFixer {
  public static void main(String[] args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";
    url = url.substring(0, 5) + ":" + url.substring(5);

    System.out.println(url.replace("bots", "odds"));
  }
}
