import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FirstDraw {
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
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
    extendedDrawer(g, 0, 0, 300);
  }

  public static void extendedDrawer(Graphics g, int x, int y, int dim) {
    if (dim < 10) {
      return;
    }
    else {
      g.drawRect(x + dim / 3, y, dim / 3, dim / 3);
      g.drawRect(x, y + dim / 3, dim / 3, dim / 3);
      g.drawRect(x + 2 * dim / 3, y + dim / 3, dim / 3, dim / 3);
      g.drawRect(x + dim / 3, y + 2 * dim / 3, dim / 3, dim / 3);
      extendedDrawer(g, x + dim / 3, y, dim / 3);
      extendedDrawer(g, x, y + dim / 3, dim / 3);
      extendedDrawer(g, x + 2 * dim / 3, y + dim / 3, dim / 3);
      extendedDrawer(g, x + dim / 3, y + 2 * dim / 3, dim / 3);

    }
  }
}

