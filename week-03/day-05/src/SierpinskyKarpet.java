import javax.swing.*;
import java.awt.*;

import static java.awt.image.ImageObserver.FRAMEBITS;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyKarpet {
  final static int FRAMEDIMENSION = 800;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(FRAMEDIMENSION, FRAMEDIMENSION));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      this.setBackground(Color.WHITE);
      g.setColor(Color.BLACK);
      mainDraw(g, FRAMEDIMENSION / 2, FRAMEDIMENSION / 2, FRAMEDIMENSION / 3);
    }
  }

  public static void mainDraw(Graphics g, int x, int y, int dim){
    if (dim < 1) {
      return;
    }
    else {
      g.fillRect(x - dim / 2, y - dim / 2, dim, dim);
      mainDraw(g,x - dim, y, dim / 3);
      mainDraw(g,x + dim, y, dim / 3);
      mainDraw(g,x, y - dim, dim / 3);
      mainDraw(g,x, y + dim, dim / 3);
      mainDraw(g,x - dim, y - dim, dim / 3);
      mainDraw(g,x + dim, y + dim, dim / 3);
      mainDraw(g,x - dim, y + dim, dim / 3);
      mainDraw(g,x + dim, y - dim, dim / 3);
    }
  }
}
