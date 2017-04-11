import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  static final int WIDTH_IN_SQUARES = 15;
  static final int HEIGHT_IN_SQUARES = 8;
  static final int DIMENSION = 72;
  static final int[][] MAP = generateRandomMap();
  static String heroOrientation = "hero-down";

  int heroX;
  int heroY;

  public Board() {
    heroX = 0;
    heroY = 0;

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
      if (heroY > 0) {
        heroY -= DIMENSION;
      }
      heroOrientation = "hero-up";
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      if (heroY < HEIGHT_IN_SQUARES * DIMENSION) {
        heroY += DIMENSION;
      }
      heroOrientation = "hero-down";
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      if (heroX < WIDTH_IN_SQUARES * DIMENSION) {
        heroX += DIMENSION;
      }
      heroOrientation = "hero-right";
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      if (heroX > 0) {
        heroX -= DIMENSION;
      }
      heroOrientation = "hero-left";
    }
    repaint();
  }


  public void renderMap(Graphics graphics) {
    for (int i = 0; i < WIDTH_IN_SQUARES; ++i) {
      for (int j = 0; j < HEIGHT_IN_SQUARES; ++j) {
        if (MAP[i][j] == 0) {
          PositionedImage floor = new PositionedImage("img/floor.png", i * DIMENSION, j * DIMENSION);
          floor.draw(graphics);
        } else if (MAP[i][j] == 1) {
          PositionedImage wall = new PositionedImage("img/wall.png", i * DIMENSION, j * DIMENSION);
          wall.draw(graphics);
        }
      }
    }
  }

  public void renderHero(Graphics graphics) {
    PositionedImage hero = new PositionedImage("img/" + heroOrientation + ".png", heroX, heroY);
    hero.draw(graphics);
  }
}
