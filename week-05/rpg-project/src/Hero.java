public class Hero extends Character {
  private String orientation;

  public Hero() {
    super();
    this.orientation = "hero-down";
  }

  public Hero(String orientation) {
    super();
    this.orientation = orientation;
  }

  @Override
  public String getOrientation() {
    return orientation;
  }

  @Override
  public void setOrientation(String orientation) {
    this.orientation = orientation;
  }

  @Override
  public void moveUp() {
    if (actualPositionY > 0) {
      if (Map.map[actualPositionY - 1][actualPositionX] != 1) {
        --actualPositionY;
      }
    }
    setOrientation("hero-up");
  }
}


