import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawHexagonFractal {
  final static int DIMENSION = 500;
  final static int XCORD = 250;
  final static int YCORD = 250;
  final static int SIZE = 250;

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
      this.setBackground(Color.WHITE);
      mainDraw(g, XCORD, YCORD, SIZE);
    }
  }

  public static void mainDraw(Graphics g, int x, int y, int dim) {
    if (dim < 10) {
      return;
    }
    else {
      Polygon hexagon = new Polygon();
      double a;
      for (int i=0; i < 7; i++) {
        a = Math.PI / 3.0 * i;
        hexagon.addPoint((int)(Math.round(x + Math.sin(a) * dim)), (int)(Math.round(y + Math.cos(a) * dim)));
      }
      g.drawPolygon(hexagon);
      dim = dim / 2;
      mainDraw(g, x, y - dim, dim);
      mainDraw(g, x - (int)(dim * Math.sin(Math.PI / 3)), y + (int)(dim * Math.sin(Math.PI / 6)), dim);
      mainDraw(g, x + (int)(dim * Math.sin(Math.PI / 3)), y + (int)(dim * Math.sin(Math.PI / 6)), dim);
    }
  }
}

