import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  static final int WIDTH_IN_SQUARES = 15;
  static final int HEIGHT_IN_SQUARES = 8;
  static final int DIMENSION = 72;
  static final int[][] MAP = generateRandomMap();

  int testBoxX;
  int testBoxY;

  public Board() {
    testBoxX = 0;
    testBoxY = 0;

    setPreferredSize(new Dimension(WIDTH_IN_SQUARES * DIMENSION, HEIGHT_IN_SQUARES * DIMENSION));
    setVisible(true);
  }

  public static int[][] generateRandomMap() {
    int[][] randomMap = new int[WIDTH_IN_SQUARES][HEIGHT_IN_SQUARES];
    for (int i = 0; i < WIDTH_IN_SQUARES; ++i) {
      for (int j = 0; j < HEIGHT_IN_SQUARES; ++j) {
        randomMap[i][j] = (int) (.5 + (Math.random()));
      }
    }
    return randomMap;
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    renderMap(graphics, MAP);
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


  public void renderMap(Graphics graphics, int[][] map) {
    for (int i = 0; i < WIDTH_IN_SQUARES; ++i) {
      for (int j = 0; j < HEIGHT_IN_SQUARES; ++j) {
        if (map[i][j] == 0) {
          PositionedImage image = new PositionedImage("img/floor.png", i * DIMENSION, j * DIMENSION);
          image.draw(graphics);
        } else {
          PositionedImage image = new PositionedImage("img/wall.png", i, j);
          image.draw(graphics);
        }
      }
    }
  }

  public void renderHero(Graphics graphics) {
    graphics.fillRect(testBoxX, testBoxY, DIMENSION, DIMENSION);
  }
}
