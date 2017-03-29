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
    int numberOfSquaresPerLine = 8;
    int size = 300 / numberOfSquaresPerLine;
    int switcher = 2;
    for (int i = 0; i < numberOfSquaresPerLine; ++i) {
      for (int j = 0; j < numberOfSquaresPerLine; ++j) {
        if (switcher % 2 == 0) {
          g.setColor(Color.BLUE);
        }
        else {
          g.setColor(Color.YELLOW);
        }
        g.fillRect(j * size, i * size, size, size);
        ++switcher;
      }
      ++switcher;
    }
  }
}