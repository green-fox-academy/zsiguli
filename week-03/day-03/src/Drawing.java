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
    for (int i = 0; i <= 150; i += 10) {
      g.setColor(Color.GREEN);
      g.drawLine(0 + i , 150, 150, 150 - i);
      g.drawLine(0 + i, 150, 150, 150 + i);
      g.drawLine(300 - i, 150, 150, 150 - i);
      g.drawLine(300 - i, 150, 150, 150 + i);
    }
  }
}