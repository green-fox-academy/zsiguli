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
   int[][] dots = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
   int[][] anotherDots = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
                        {120, 100}, {85, 130}, {50, 100}};
    try {
      for (int i = 0; i < dots.length; ++i) {
        g.drawLine(dots[i][0], dots[i][1], dots[i + 1][0], dots[i + 1][1]);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
        g.drawLine(dots[dots.length - 1][0], dots[dots.length - 1][1], dots[0][0], dots[0][1]);

    }
    try {
      for (int i = 0; i < anotherDots.length; ++i) {
        g.drawLine(anotherDots[i][0], anotherDots[i][1], anotherDots[i + 1][0], anotherDots[i + 1][1]);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      g.drawLine(anotherDots[anotherDots.length - 1][0], anotherDots[anotherDots.length - 1][1], anotherDots[0][0], anotherDots[0][1]);

    }
  }
}