import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyKarpet {
  final static int FRAMEDIMENSION = 500;

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
      this.setBackground(Color.WHITE);
      g.setColor(Color.BLACK);
      mainDraw(g, FRAMEDIMENSION / 2, FRAMEDIMENSION / 2, FRAMEDIMENSION / 3);
    }
  }

  public static void mainDraw(Graphics g, int x, int y, int dim) {
    if (dim < 5) {
      return;
    } else {
      g.fillRect(x - dim / 2, y - dim / 2, dim, dim);
      for (double i = 0; i <= Math.PI; i += Math.PI / 2) {
        for (double j = Math.PI; j <= 2 * Math.PI; j += Math.PI / 2) {
          mainDraw(g, x + (int) (Math.cos(i)) * dim, y + (int) (Math.cos(j)) * dim, dim / 3);
        }
      }
    }
  }
}
