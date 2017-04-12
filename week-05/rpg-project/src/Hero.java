public class Hero extends Character {

  public Hero() {
    super();
    this.costumeImage = "hero-down";
    this.maximumHp = 20 + 3 * d6();
    this.currentHp = this.maximumHp;
    this.defendPoint = 2 * d6();
    this.strikePoint = 5 + d6();
  }

  @Override
  public void moveUp() {
    if (actualPosition.y > 0) {
      if (Map.map[actualPosition.y - 1][actualPosition.x] != 1) {
        --actualPosition.y;
      }
    }
    setCostumeImage("hero-up");
  }

  public void moveDown() {
    try {
      if (actualPosition.y < GameDraw.HEIGHT_IN_SQUARES - 1) {
        if (Map.map[actualPosition.y + 1][actualPosition.x] != 1) {
          ++actualPosition.y;
        }
      }
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("hm is this really a problem?");
    }
    setCostumeImage("hero-down");
  }

  public void moveRight() {
    try {
      if (actualPosition.x < GameDraw.WIDTH_IN_SQUARES - 1) {
        if (Map.map[actualPosition.y][actualPosition.x + 1] != 1) {
          ++actualPosition.x;
        }
      }
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("here is an error I will fix it later");
    }
    setCostumeImage("hero-right");
  }

  public void moveLeft() {
    if (actualPosition.x > 0) {
      if (Map.map[actualPosition.y][actualPosition.x - 1] != 1) {
        --actualPosition.x;
      }
    }
    setCostumeImage("hero-left");
  }
}


