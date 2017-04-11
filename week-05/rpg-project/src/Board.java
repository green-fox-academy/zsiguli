import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {
  static final int WIDTH_IN_SQUARES = 15;
  static final int HEIGHT_IN_SQUARES = 8;
  static final int DIMENSION = 72;
  static final int[][] MAP = {
          {0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1},
          {0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0},
          {1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
          {1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0},
          {0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0},
          {0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0},
          {0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0},
          {0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0}
  };
  static String heroOrientation = "hero-down";
  static int nextStepValue = 0;
  static int heroActualPositionX = 0;
  static int heroActualPositionY = 0;

  int heroX;
  int heroY;

  public Board() {
    heroX = 0;
    heroY = 0;

    setPreferredSize(new Dimension(WIDTH_IN_SQUARES * DIMENSION, HEIGHT_IN_SQUARES * DIMENSION));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    renderMap(graphics);
    renderHero(graphics);
    System.out.println(heroActualPositionX);
    System.out.println(heroActualPositionY);
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
    try {
      if (e.getKeyCode() == KeyEvent.VK_UP) {
        nextStepValue = MAP[heroActualPositionY - 1][heroActualPositionX];
      } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        nextStepValue = MAP[heroActualPositionY + 1][heroActualPositionX];
      } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
        nextStepValue = MAP[heroActualPositionY][heroActualPositionX + 1];
      } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        nextStepValue = MAP[heroActualPositionY][heroActualPositionX - 1];
      }
    } catch (ArrayIndexOutOfBoundsException ex) {
      nextStepValue = 1;
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      if (heroY > 0 && nextStepValue != 1) {
        heroY -= DIMENSION;
        --heroActualPositionY;
      }
      heroOrientation = "hero-up";
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      if (heroY < (HEIGHT_IN_SQUARES * DIMENSION) - DIMENSION && nextStepValue != 1) {
        heroY += DIMENSION;
        ++heroActualPositionY;
      }
      heroOrientation = "hero-down";
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      if (heroX < (WIDTH_IN_SQUARES * DIMENSION) - DIMENSION && nextStepValue != 1) {
        heroX += DIMENSION;
        ++heroActualPositionX;
      }
      heroOrientation = "hero-right";
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      if (heroX > 0  && nextStepValue != 1) {
        heroX -= DIMENSION;
        --heroActualPositionX;
      }
      heroOrientation = "hero-left";
    }
    repaint();
  }


  public void renderMap(Graphics graphics) {
    for (int i = 0; i < WIDTH_IN_SQUARES; ++i) {
      for (int j = 0; j < HEIGHT_IN_SQUARES; ++j) {
        if (MAP[j][i] == 0) {
          PositionedImage floor = new PositionedImage("img/floor.png", i * DIMENSION, j * DIMENSION);
          floor.draw(graphics);
        } else if (MAP[j][i] == 1) {
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
