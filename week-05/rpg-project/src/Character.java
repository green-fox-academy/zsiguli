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

  }

  public void moveDown() {

  }

  public void moveRight() {

  }

  public void moveLeft() {

  }

  public int d6() {
    return 1 + (int) (Math.random() * 6);
  }

  public void strike(Character enemy) {
    int ownStrikeValue = strikePoint * d6();
    int enemyStrikeValue = enemy.strikePoint * d6();
    if (2 * d6() + ownStrikeValue > enemy.defendPoint) {
      if (ownStrikeValue - enemy.defendPoint > 0) {
        enemy.currentHp -= level;
      }
    }
    if (2 * d6() + enemyStrikeValue > defendPoint) {
      if (enemyStrikeValue - defendPoint > 0) {
        currentHp -= enemy.level;
      }
    }
  }
}