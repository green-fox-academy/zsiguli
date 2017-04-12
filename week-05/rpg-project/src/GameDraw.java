import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameDraw extends JComponent implements KeyListener {
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

  Character hero1 = new Hero();
  int[] temp1 = getRandomPosition();
  Character skeleton1 = new Skeleton(0, temp1[0] * DIMENSION, temp1[1] * DIMENSION);
  int[] temp2 = getRandomPosition();
  Character skeleton2 = new Skeleton(0, temp2[0] * DIMENSION, temp2[1] * DIMENSION);
  int[] temp3 = getRandomPosition();
  Character skeleton3 = new Skeleton(0, temp3[0] * DIMENSION, temp3[1] * DIMENSION);


  public GameDraw() {
    setPreferredSize(new Dimension(WIDTH_IN_SQUARES * DIMENSION, HEIGHT_IN_SQUARES * DIMENSION));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    renderMap(graphics);
    renderSkeleton(graphics, (Skeleton) skeleton1);
    renderSkeleton(graphics, (Skeleton) skeleton2);
    renderSkeleton(graphics, (Skeleton) skeleton3);
    renderHero(graphics);
  }

  public static void gameDrawMain() {
    JFrame frame = new JFrame("RPG Game");
    GameDraw gameDraw = new GameDraw();
    frame.add(gameDraw);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.pack();
    frame.addKeyListener(gameDraw);
  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      if (hero1.actualPositionY > 0) {
        if (MAP[hero1.actualPositionY - 1][hero1.actualPositionX] != 1) {
          --hero1.actualPositionY;
        }
      }
      hero1.setOrientation("hero-up");
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      try {
        if (hero1.actualPositionY < HEIGHT_IN_SQUARES) {
          if (MAP[hero1.actualPositionY + 1][hero1.actualPositionX] != 1) {
            ++hero1.actualPositionY;
          }
        }
      } catch (ArrayIndexOutOfBoundsException ex) {
        System.out.println("hm is this really a problem?");
      }
      hero1.setOrientation("hero-down");
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      try {
        if (MAP[hero1.actualPositionY][hero1.actualPositionX + 1] != 1) {
          if (hero1.actualPositionX < WIDTH_IN_SQUARES) {
            ++hero1.actualPositionX;
          }
        }
      } catch (ArrayIndexOutOfBoundsException ex) {
        System.out.println("here is an error I will fix it later");
      }
      hero1.setOrientation("hero-right");
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      if (MAP[hero1.actualPositionY][hero1.actualPositionX - 1] != 1) {
        if (hero1.actualPositionX > 0) {
          --hero1.actualPositionX;
        }
      }
      hero1.setOrientation("hero-left");
    }
    repaint();
  }

  @Override
  public void keyReleased(KeyEvent e) {

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
    PositionedImage hero = new PositionedImage("img/" + hero1.getOrientation() + ".png", hero1.getActualPositionX() * DIMENSION, hero1.getActualPositionY() * DIMENSION);
    hero.draw(graphics);
  }

  public void renderSkeleton(Graphics graphics, Skeleton skeleton) {
    PositionedImage skeletonImg = new PositionedImage("img/skeleton.png", skeleton.getActualPositionY(), skeleton.getActualPositionX());
    skeletonImg.draw(graphics);
  }

  public int[] getRandomPosition() {
    int[] randomPosition = new int[2];
    do {
      randomPosition[0] = (int) (Math.random() * HEIGHT_IN_SQUARES);
      randomPosition[1] = (int) (Math.random() * WIDTH_IN_SQUARES);
    } while (MAP[randomPosition[0]][randomPosition[1]] == 1);
    return randomPosition;
  }
}
