import java.awt.*;

public class Character {
  String costumeImage;
  Point actualPosition = new Point();
  int maximumHp;
  int currentHp;
  int defendPoint;
  int strikePoint;
  int level;

  public Character() {
    this.actualPosition.x = 0;
    this.actualPosition.y = 0;
    this.level = 1;
  }

  public Character(Point actualPosition) {
    this.actualPosition.x = actualPosition.y;
    this.actualPosition.y = actualPosition.x;
    this.level = 1;
  }

  public String getCostumeImage() {
    return costumeImage;
  }

  public void setCostumeImage(String costumeImage) {
    this.costumeImage = costumeImage;
  }

  public int getActualPositionX() {
    return actualPosition.x;
  }

  public int getActualPositionY() {
    return actualPosition.y;
  }

  public void moveUp() {
    if (actualPosition.y > 0) {
      if (Map.map[actualPosition.y - 1][actualPosition.x] != 1) {
        --actualPosition.y;
      }
    }
  }

  public void moveDown() {
    if (actualPosition.y < GameDraw.HEIGHT_IN_SQUARES - 1) {
      if (Map.map[actualPosition.y + 1][actualPosition.x] != 1) {
        ++actualPosition.y;
      }
    }
  }

  public void moveRight() {
    if (actualPosition.x < GameDraw.WIDTH_IN_SQUARES - 1) {
      if (Map.map[actualPosition.y][actualPosition.x + 1] != 1) {
        ++actualPosition.x;
      }
    }
  }

  public void moveLeft() {
    if (actualPosition.x > 0) {
      if (Map.map[actualPosition.y][actualPosition.x - 1] != 1) {
        --actualPosition.x;
      }
    }
  }

  public int d6() {
    return 1 + (int) (Math.random() * 6);
  }

  public int d4() {
    return 1 + (int) (Math.random() * 4);
  }

  public void strike(Character enemy) {
    int ownStrikeValue = strikePoint * d6();
    int enemyStrikeValue = enemy.strikePoint * d6();
    if (2 * d6() + ownStrikeValue > enemy.defendPoint) {
      if (ownStrikeValue - enemy.defendPoint > 0) {
        enemy.currentHp -= level;
        if (enemy.currentHp < 1) {
          enemy.die();
        }
      }
    }
    if (2 * d6() + enemyStrikeValue > defendPoint) {
      if (enemyStrikeValue - defendPoint > 0) {
        currentHp -= enemy.level;
        if (currentHp < 1) {
          die();
        }
      }
    }
  }

  public void die() {
    if (Game.characters.get(0).currentHp > 0) {
      Game.characters.get(0).levelUp();
    }
    Game.characters.remove(this);
    if (Game.characters.size() == 1 && Game.characters.get(0) instanceof Hero) {
      if (Game.heroStats.isEmpty()) {
        Game.heroStats.add(Game.characters.get(0).level);
        Game.heroStats.add(Game.characters.get(0).maximumHp);
        Game.heroStats.add(Game.characters.get(0).defendPoint);
        Game.heroStats.add(Game.characters.get(0).strikePoint);
      } else {
        Game.heroStats.set(0, Game.characters.get(0).level);
        Game.heroStats.set(1, Game.characters.get(0).maximumHp);
        Game.heroStats.set(2, Game.characters.get(0).defendPoint);
        Game.heroStats.set(3, Game.characters.get(0).strikePoint);
      }
      Game.initCharacters();
    }
  }

  public void levelUp() {

  }
}