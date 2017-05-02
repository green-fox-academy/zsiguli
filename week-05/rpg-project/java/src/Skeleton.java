import java.awt.*;

public class Skeleton extends Character {
  public Skeleton() {
    super();
  }

  public Skeleton(Point setPosition) {
    super(setPosition);
    costumeImage = "skeleton";
    this.maximumHp = 2 * Game.level * d6();
    this.currentHp = this.maximumHp;
    this.defendPoint = Game.level / 2 * d6();
    this.strikePoint = Game.level * d6();
  }

  public Skeleton(Point setPosition, int setLevel) {
    super(setPosition);
    costumeImage = "skeleton";
    Game.level = setLevel;
    this.maximumHp = 2 * Game.level * d6();
    this.currentHp = this.maximumHp;
    this.defendPoint = Game.level / 2 * d6();
    this.strikePoint = Game.level * d6();
  }
}
