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
      this.setBackground(Color.BLACK);
        mainDraw(g);
    }
  }

  public static void mainDraw(Graphics g) {
   for (int i = 0; i < 1000; ++i) {
     g.setColor(new Color(255,255,(int)(Math.random() * 100) + 60));
     g.drawRect((int)(Math.random() * 300), ((int)(Math.random() * 300)), 5, 5);
   }
  }
}