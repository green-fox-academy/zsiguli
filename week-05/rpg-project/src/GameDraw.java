import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class GameDraw extends JComponent implements KeyListener {
  static final int WIDTH_IN_SQUARES = 15;
  static final int HEIGHT_IN_SQUARES = 8;
  static final int DIMENSION = 72;
  static final int WIDTH = WIDTH_IN_SQUARES * DIMENSION;
  static final int HEIGHT = HEIGHT_IN_SQUARES * DIMENSION;

  public GameDraw() {
    setPreferredSize(new Dimension(WIDTH, HEIGHT + 100));
    setVisible(true);
  }

  @Override
  public void paint(Graphics graphics) {
    super.paint(graphics);
    graphics.setFont(new Font("TimesRoman", Font.ITALIC, 20));
    Character hero = Game.characters.get(0);
    graphics.drawString("Hero (Level 1) HP: " + hero.maximumHp + "/" + hero.currentHp + " | DP: " + hero.defendPoint +
            " | SP: " + hero.strikePoint, WIDTH / 3, HEIGHT + 30);
    renderMap(graphics);
    renderCharacters(graphics, Game.characters);
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
      Game.characters.get(0).moveUp();
    } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      Game.characters.get(0).moveDown();
    } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      Game.characters.get(0).moveRight();
    } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      Game.characters.get(0).moveLeft();
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
}
