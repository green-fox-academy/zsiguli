import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class GameDraw extends JComponent implements KeyListener {
  static final int WIDTH_IN_SQUARES = 15;
  static final int HEIGHT_IN_SQUARES = 8;
  static final int DIMENSION = 72;

  Character hero1 = new Hero();
  int[] temp1 = getRandomPosition();
  Character skeleton1 = new Skeleton(temp1[1], temp1[0]);
  int[] temp2 = getRandomPosition();
  Character skeleton2 = new Skeleton(temp2[1], temp2[0]);
  int[] temp3 = getRandomPosition();
  Character skeleton3 = new Skeleton(temp3[1], temp3[0]);


  public GameDraw() {
    setPreferredSize(new Dimension(WIDTH_IN_SQUARES * DIMENSION, HEIGHT_IN_SQUARES * DIMENSION));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    renderMap(graphics);
    ArrayList<Character> characters = new ArrayList<>();
    characters.add(hero1);
    characters.add(skeleton1);
    characters.add(skeleton2);
    characters.add(skeleton3);
    renderCharacters(graphics, characters);




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
    if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
      System.exit(0);
    } else if (e.getKeyCode() == KeyEvent.VK_UP) {
      hero1.moveUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      hero1.moveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      hero1.moveRight();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      hero1.moveLeft();
    }
    repaint();
  }

  @Override
  public void keyReleased(KeyEvent e) {

  }


  public void renderMap(Graphics graphics) {
    for (int i = 0; i < WIDTH_IN_SQUARES; ++i) {
      for (int j = 0; j < HEIGHT_IN_SQUARES; ++j) {
        if (Map.map[j][i] == 0) {
          PositionedImage floor = new PositionedImage("img/floor.png", i * DIMENSION, j * DIMENSION);
          floor.draw(graphics);
        } else if (Map.map[j][i] == 1) {
          PositionedImage wall = new PositionedImage("img/wall.png", i * DIMENSION, j * DIMENSION);
          wall.draw(graphics);
        }
      }
    }
  }

  public void renderCharacters(Graphics graphics, ArrayList<Character> characters) {
    for (Character character : characters) {
      PositionedImage characterImg = new PositionedImage("img/" + character.getCostumeImage() + ".png", character.getActualPositionX() * DIMENSION, character.getActualPositionY() * DIMENSION);
      characterImg.draw(graphics);
    }
  }

  public int[] getRandomPosition() {
    int[] randomPosition = new int[2];
    do {
      randomPosition[0] = (int) (Math.random() * HEIGHT_IN_SQUARES);
      randomPosition[1] = (int) (Math.random() * WIDTH_IN_SQUARES);
    } while (Map.map[randomPosition[0]][randomPosition[1]] == 1);
    return randomPosition;
  }

}
