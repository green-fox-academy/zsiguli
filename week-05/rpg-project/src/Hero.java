public class Hero extends Character {

  public Hero() {
    super();
    this.costumeImage = "hero-down";
  }

  public Hero(String costumeImage) {
    super();
    this.costumeImage = costumeImage;
  }

  @Override
  public void moveUp() {
    if (actualPositionY > 0) {
      if (Map.map[actualPositionY - 1][actualPositionX] != 1) {
        --actualPositionY;
      }
    }
    setCostumeImage("hero-up");
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
    setCostumeImage("hero-down");
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
    setCostumeImage("hero-right");
  }

  public void moveLeft() {
    if (actualPositionX > 0) {
      if (Map.map[actualPositionY][actualPositionX - 1] != 1) {
        --actualPositionX;
      }
    }
    setCostumeImage("hero-left");
  }
}


