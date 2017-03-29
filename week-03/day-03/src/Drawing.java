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
    for (int i = 0; i < 3; ++i) {
      rectDrawer(g, 300 - (i * 100), i);
    }
  }

  public static void rectDrawer(Graphics g, int size, int i) {
    switch (i) {
      case 0: g.setColor(Color.RED);
       break;
      case 1: g.setColor(Color.GREEN);
       break;
      case 2: g.setColor(Color.BLUE);
    }
    g.fillRect(150 - size / 2, 150 - size / 2, size, size);
  }
}