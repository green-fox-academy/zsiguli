public class PostIt {
  String backgroundColor;
  String text;
  String textColor;

  public PostIt(String backgroundColor, String text, String textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
  }

  public static void main(String[] args) {
    PostIt postIt1 = new PostIt("orange", "blue", "Idea 1");
    PostIt postIt2 = new PostIt("pink", "black", "Awesome");
    PostIt postIt3 = new PostIt("yellow", "green", "Superb!");
  }
}
