import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyKarpet {
  final static int FRAMEDIMENSION = 700;

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
      for (int i = -1; i <= 1; ++i) {
        for (int j = -1; j <= 1; ++j) {
          if (i == 0 && j == 0) {
            continue;
          } else {
            mainDraw(g, x + i * dim, y + j * dim, dim / 3);
          }
        }
      }
    }
  }
}


