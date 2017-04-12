import java.awt.*;

public class Skeleton extends Character {
  public Skeleton() {
    super();
  }

  public Skeleton(Point setPosition) {
    super(setPosition);
    costumeImage = "skeleton";
    this.maximumHp = 2 * this.level * d6();
    this.currentHp = this.maximumHp;
    this.defendPoint = this.level / 2 * d6();
    this.strikePoint = this.level * d6();
  }

  public Skeleton(Point setPosition, int setLevel) {
    super(setPosition);
    costumeImage = "skeleton";
    this.level = setLevel;
    this.maximumHp = 2 * this.level * d6();
    this.currentHp = this.maximumHp;
    this.defendPoint = this.level / 2 * d6();
    this.strikePoint = this.level * d6();
  }
}
