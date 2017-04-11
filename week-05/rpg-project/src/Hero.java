public class Hero {
  String heroOrientation;
  int nextStepValue;
  int heroActualPositionX;
  int heroActualPositionY;

  public Hero() {
    this.heroOrientation = "hero-down";
    this.nextStepValue = 0;
    this.heroActualPositionX = 0;
    this.heroActualPositionY = 0;
  }

  public Hero(String heroOrientation, int nextStepValue, int heroActualPositionX, int heroActualPositionY) {
    this.heroOrientation = heroOrientation;
    this.nextStepValue = nextStepValue;
    this.heroActualPositionX = heroActualPositionX;
    this.heroActualPositionY = heroActualPositionY;
  }


}
