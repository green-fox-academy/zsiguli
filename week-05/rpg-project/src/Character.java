public class Character {
  String orientation;
  int nextStepValue;
  int actualPositionX;
  int actualPositionY;

  public Character() {
    this.nextStepValue = 0;
    this.actualPositionX = 0;
    this.actualPositionY = 0;
  }

  public Character(int nextStepValue, int actualPositionX, int actualPositionY) {
    this.nextStepValue = nextStepValue;
    this.actualPositionX = actualPositionX;
    this.actualPositionY = actualPositionY;
  }

  public String getOrientation() {
    return orientation;
  }

  public void setOrientation(String orientation) {
    this.orientation = orientation;
  }
}