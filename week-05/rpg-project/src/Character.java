public class Character {
  String orientation;
//  int nextStepValue;
  int actualPositionX;
  int actualPositionY;

  public Character() {
//    this.nextStepValue = 0;
    this.actualPositionX = 0;
    this.actualPositionY = 0;
  }

  public Character(int actualPositionX, int actualPositionY) {
//    int nextStepValue,
//    this.nextStepValue = nextStepValue;
    this.actualPositionX = actualPositionX;
    this.actualPositionY = actualPositionY;
  }

  public String getOrientation() {
    return orientation;
  }

  public void setOrientation(String orientation) {
    this.orientation = orientation;
  }

  public int getActualPositionX() {
    return actualPositionX;
  }

  public int getActualPositionY() {
    return actualPositionY;
  }

  public void moveUp() {

  }

  public void moveDown() {

  }

  public void moveRight() {

  }

  public void moveLeft() {

  }
}