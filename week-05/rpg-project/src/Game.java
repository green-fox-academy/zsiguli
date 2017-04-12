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
}
