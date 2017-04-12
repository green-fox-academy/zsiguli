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

  public void moveDown() {
    try {
      if (actualPositionY < GameDraw.HEIGHT_IN_SQUARES - 1) {
        if (Map.map[actualPositionY + 1][actualPositionX] != 1) {
          ++actualPositionY;
        }
      }
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("hm is this really a problem?");
    }
    setOrientation("hero-down");
  }

  public void moveRight() {
    try {
      if (actualPositionX < GameDraw.WIDTH_IN_SQUARES - 1) {
        if (Map.map[actualPositionY][actualPositionX + 1] != 1) {
          ++actualPositionX;
        }
      }
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("here is an error I will fix it later");
    }
    setOrientation("hero-right");
  }

  public void moveLeft() {
    if (actualPositionX > 0) {
      if (Map.map[actualPositionY][actualPositionX - 1] != 1) {
        --actualPositionX;
      }
    }
    setOrientation("hero-left");
  }
}


