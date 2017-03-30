import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FirstDraw {
  final static int DIMENSION = 500;
  final static int XCORD = 0;
  final static int YCORD = 0;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(DIMENSION, DIMENSION));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      mainDraw(g);
      this.setBackground(Color.YELLOW);
    }
  }

  public static void mainDraw(Graphics g) {
    extendedDrawer(g, XCORD, YCORD, DIMENSION);
  }

  public static void extendedDrawer(Graphics g, int x, int y, int dim) {
    if (dim < 10) {
      return;
    }
    else {
      dim = dim / 3;
      g.drawRect(x + dim, y, dim, dim);
      g.drawRect(x, y + dim, dim, dim);
      g.drawRect(x + 2 * dim, y + dim, dim, dim);
      g.drawRect(x + dim, y + 2 * dim, dim, dim);
      extendedDrawer(g, x + dim, y, dim);
      extendedDrawer(g, x, y + dim, dim);
      extendedDrawer(g, x + 2 * dim, y + dim, dim);
      extendedDrawer(g, x + dim, y + 2 * dim, dim);
    }
  }
}

