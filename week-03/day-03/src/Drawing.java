import javax.swing.*;

import java.awt.*;

import static java.lang.StrictMath.sin;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
        mainDraw(g);
    }
  }

  public static void mainDraw(Graphics g) {
    for (int i = 0; i < 6; ++i) {
      rectDrawer(g, 300 - (i * 300 / 6), i);
    }
  }

  public static void rectDrawer(Graphics g, int size, int i) {
    switch (i) {
      case 0: g.setColor(new Color(255, 0, 255));
        break;
      case 1: g.setColor(Color.BLUE);
        break;
      case 2: g.setColor(Color.GREEN);
        break;
      case 3: g.setColor(Color.YELLOW);
        break;
      case 4: g.setColor(Color.ORANGE);
        break;
      case 5: g.setColor(Color.RED);
        break;
    }
    g.fillRect(150 - size / 2, 150 - size / 2, size, size);
  }
}