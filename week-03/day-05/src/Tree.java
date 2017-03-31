import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {
  final static int FRAMEDIMENSION = 500;
  final static int INITIALLENGTH = 100;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(FRAMEDIMENSION, FRAMEDIMENSION));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      this.setBackground(new Color(003442));
      g.setColor(Color.YELLOW);
      mainDraw(g, FRAMEDIMENSION / 2, (int)(FRAMEDIMENSION * .8), INITIALLENGTH, Math.PI / 2);
    }
  }

  public static void mainDraw(Graphics g, int x, int y, int len, double angle) {
    if (len < 5) {
      return;
    } else {
//      System.out.println("x: " + (int)(Math.cos(angle)) * len + " y: " + (int)(Math.sin(angle)) * len);
      g.drawLine(x, y, x + (int)((Math.cos(angle)) * len), y - (int)((Math.sin(angle)) * len));

      mainDraw(g, x + (int)(Math.cos(angle)) * len, y - len * (int)(Math.sin(angle)), (int)(len * .8), Math.PI / 3 );
      mainDraw(g, x + (int)(Math.cos(angle)) * len, y - len * (int)(Math.sin(angle)), (int)(len * .8), Math.PI / 2 );
      mainDraw(g, x + (int)(Math.cos(angle)) * len, y - len * (int)(Math.sin(angle)), (int)(len * .8), 2 * Math.PI / 3 );
//      g.setColor(Color.RED);
//      mainDraw(g, x - 5, y - 5, (int)(len * .9));
    }
  }
}
