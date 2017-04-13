import java.awt.*;
import java.util.ArrayList;

public class Game {

  public static ArrayList<Character> characters;
  public static final int skeletonNum = 3;

  public static void main(String[] args) {
    initCharacters();
    GameDraw.gameDraw();
  }

  public static void initCharacters() {
    characters = new ArrayList<>();
    characters.add(new Hero());
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
}
