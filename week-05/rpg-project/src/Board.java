import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  static final int WIDTH = 15;
  static final int HEIGHT = 8;
  static final int DIMENSION = 72;

  int testBoxX;
  int testBoxY;

  public Board() {
    testBoxX = 0;
    testBoxY = 0;

    setPreferredSize(new Dimension(WIDTH * DIMENSION, HEIGHT * DIMENSION));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    renderMap(graphics);
    renderHero(graphics);
  }

  public static void boardMain() {
    JFrame frame = new JFrame("RPG Game");
    Board board = new Board();
    frame.add(board);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(board);
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      testBoxY -= DIMENSION;
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      testBoxY += DIMENSION;
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      testBoxX += DIMENSION;
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      testBoxX -= DIMENSION;
    }
    repaint();
  }

  public void renderMap(Graphics graphics) {
    for (int i = 0; i < WIDTH * DIMENSION; i += DIMENSION) {
      for (int j = 0; j < WIDTH * DIMENSION; j += DIMENSION) {
        PositionedImage image = new PositionedImage("img/floor.png", i, j);
        image.draw(graphics);
      }
    }
  }

  public void renderHero(Graphics graphics) {
    graphics.fillRect(testBoxX, testBoxY, DIMENSION, DIMENSION);
  }
}
