public class Hero {
  String heroOrientation = "hero-down";
  int nextStepValue = 0;
  int heroActualPositionX = 0;
  int heroActualPositionY = 0;

  public Hero(String heroOrientation, int nextStepValue, int heroActualPositionX, int heroActualPositionY) {
    this.heroOrientation = heroOrientation;
    this.nextStepValue = nextStepValue;
    this.heroActualPositionX = heroActualPositionX;
    this.heroActualPositionY = heroActualPositionY;
  }
}
