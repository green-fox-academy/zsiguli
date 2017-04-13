import java.awt.*;

public class Boss extends Character {
  public Boss() {
    super();
  }

  public Boss(Point setPosition) {
    super(setPosition);
    costumeImage = "boss";
    this.maximumHp = 2 * Game.level * d6() + d6();
    this.currentHp = this.maximumHp;
    this.defendPoint = Game.level / 2 * d6() + d6() / 2;
    this.strikePoint = Game.level * d6() + Game.level;
  }
}
