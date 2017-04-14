import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Game {

  public static ArrayList<Character> characters;
  public static ArrayList heroStats = new ArrayList();
  public static int level = 0;
  public static final int skeletonNum = 3;

  public static void initCharacters() {
    ++level;
    characters = new ArrayList<>();
    if (!heroStats.isEmpty()) {
      characters.add(new Hero(heroStats));
    } else {
      characters.add(new Hero());
    }
    characters.add(new Boss(getRandomPosition()));
    for (int i = 0; i < skeletonNum; ++i) {
      characters.add(new Skeleton(getRandomPosition()));
    }
  }

  public static Point getRandomPosition() {
    Point randomPosition = new Point();
    do {
      randomPosition.x = (int) (Math.random() * GameDraw.HEIGHT_IN_SQUARES);
      randomPosition.y = (int) (Math.random() * GameDraw.WIDTH_IN_SQUARES);
    } while (Map.map[randomPosition.x][randomPosition.y] == 1);
    return randomPosition;
  }

  public static boolean isThereAnyone() {
    int heroPositionX = characters.get(0).actualPosition.x;
    int heroPositionY = characters.get(0).actualPosition.y;
    for (int i = 1; i < characters.size(); ++i) {
      int monsterPositionX = characters.get(i).actualPosition.x;
      int monsterPositionY = characters.get(i).actualPosition.y;
      if (heroPositionX == monsterPositionX && heroPositionY == monsterPositionY) {
        return true;
      }
    }
    return false;
  }

  public static Character whoIsThere(Point position) {
    Character actualEnemy = new Character();
    for (int i = 1; i < characters.size(); ++i) {
      Point temp = characters.get(i).actualPosition;
      if (temp.x == position.x && temp.y == position.y) {
        actualEnemy = characters.get(i);
      }
    }
    return actualEnemy;
  }

  public static Character attacker() {
    return Game.characters.get(0);
  }

  public static void moveMonsters() {
    for (int i = 1; i < characters.size(); ++i) {
      int num = (int) (Math.random() * 3);
      if (characters.get(i).currentHp < characters.get(i).maximumHp / 2) {
      } else {
        switch (num) {
          case 0:
            characters.get(i).moveUp();
            break;
          case 1:
            characters.get(i).moveDown();
            break;
          case 2:
            characters.get(i).moveLeft();
            break;
          case 3:
            characters.get(i).moveRight();
        }
      }
    }
  }

}
