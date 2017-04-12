import java.util.ArrayList;

public class Game {

  public static ArrayList<Character> characters;


  public static void main(String[] args) {
    initCharacters();
    GameDraw.gameDrawMain();
  }

  public static void initCharacters() {
    int[] temp1 = getRandomPosition();
    int[] temp2 = getRandomPosition();
    int[] temp3 = getRandomPosition();

    characters = new ArrayList<>();
    characters.add(new Hero());
    characters.add(new Skeleton(temp1[1], temp1[0]));
    characters.add(new Skeleton(temp2[1], temp2[0]));
    characters.add(new Skeleton(temp3[1], temp3[0]));
  }

  public static int[] getRandomPosition() {
    int[] randomPosition = new int[2];
    do {
      randomPosition[0] = (int) (Math.random() * GameDraw.HEIGHT_IN_SQUARES);
      randomPosition[1] = (int) (Math.random() * GameDraw.WIDTH_IN_SQUARES);
    } while (Map.map[randomPosition[0]][randomPosition[1]] == 1);
    return randomPosition;
  }
}
