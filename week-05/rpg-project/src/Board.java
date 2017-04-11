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
  int initPositionX = getRandomPosition()[0] * DIMENSION;
  int initPositionY = getRandomPosition()[1] * DIMENSION;
  Character hero1 = new Hero();
  Character skeleton1 = new Skeleton(0, initPositionX, initPositionY );

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
    renderSkeleton(graphics);
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
    try {
      if (e.getKeyCode() == KeyEvent.VK_UP) {
        hero1.nextStepValue = MAP[hero1.actualPositionY - 1][hero1.actualPositionX];
      } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
        hero1.nextStepValue = MAP[hero1.actualPositionY + 1][hero1.actualPositionX];
      } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
        hero1.nextStepValue = MAP[hero1.actualPositionY][hero1.actualPositionX + 1];
      } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        hero1.nextStepValue = MAP[hero1.actualPositionY][hero1.actualPositionX - 1];
      }
    } catch (ArrayIndexOutOfBoundsException ex) {
      hero1.nextStepValue = 1;
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      if (heroY > 0 && hero1.nextStepValue != 1) {
        heroY -= DIMENSION;
        --hero1.actualPositionY;
      }
      hero1.setOrientation("hero-up");
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      if (heroY < (HEIGHT_IN_SQUARES * DIMENSION) - DIMENSION && hero1.nextStepValue != 1) {
        heroY += DIMENSION;
        ++hero1.actualPositionY;
      }
      hero1.setOrientation("hero-down");
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      if (heroX < (WIDTH_IN_SQUARES * DIMENSION) - DIMENSION && hero1.nextStepValue != 1) {
        heroX += DIMENSION;
        ++hero1.actualPositionX;
      }
      hero1.setOrientation("hero-right");
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      if (heroX > 0 && hero1.nextStepValue != 1) {
        heroX -= DIMENSION;
        --hero1.actualPositionX;
      }
      hero1.setOrientation("hero-left");
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
    PositionedImage hero = new PositionedImage("img/" + hero1.getOrientation() + ".png", heroX, heroY);
    hero.draw(graphics);
  }

  public void renderSkeleton(Graphics graphics) {
    PositionedImage skeleton = new PositionedImage("img/skeleton.png", skeleton1.getActualPositionX(), skeleton1.getActualPositionY());
    skeleton.draw(graphics);
  }

  public int[] getRandomPosition() {
    int[] randomPosition = new int[2];
    randomPosition[0] = (int) (.9 + (Math.random() * WIDTH_IN_SQUARES));
    randomPosition[1] = (int) (.9 + (Math.random() * HEIGHT_IN_SQUARES));
    return randomPosition;
  }
}
