public class Hero {
  String orientation;
  int nextStepValue;
  int actualPositionX;
  int actualPositionY;

  public Hero() {
    this.orientation = "hero-down";
    this.nextStepValue = 0;
    this.actualPositionX = 0;
    this.actualPositionY = 0;
  }

  public Hero(String orientation, int nextStepValue, int actualPositionX, int actualPositionY) {
    this.orientation = orientation;
    this.nextStepValue = nextStepValue;
    this.actualPositionX = actualPositionX;
    this.actualPositionY = actualPositionY;
  }


}
