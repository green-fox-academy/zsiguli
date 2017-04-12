import java.awt.*;
import java.util.ArrayList;

public class Game {

  public static ArrayList<Character> characters;
  public static final int skeletonNum = 3;

  public static void main(String[] args) {
    initCharacters();
    GameDraw.gameDrawMain();
  }

  public static void initCharacters() {

    characters = new ArrayList<>();
    characters.add(new Hero());
    characters.add(new Boss(getRandomPosition()));
    for (int i = 0; i < skeletonNum; ++i) {
      characters.add(new Skeleton(getRandomPosition(), 9));
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
    System.out.println(heroPositionX);
    System.out.println(heroPositionY);
    for (int i = 1; i < characters.size(); ++i) {
      int monsterPositionX = characters.get(i).actualPosition.x;
      int monsterPositionY = characters.get(i).actualPosition.y;
//      System.out.println(monsterPositionX);
//      System.out.println(monsterPositionY);
      if (heroPositionX == monsterPositionX && heroPositionY == monsterPositionY) {
        return true;
      }
    }
    return false;
  }
}
