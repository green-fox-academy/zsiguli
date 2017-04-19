public class Car {

  private Enum type;
  private Enum color;

  public Car() {
    type = Type.values()[(int) (Math.random() * 4)];
    color = Color.values()[(int) (Math.random() * 4)];
  }

  public Enum getType() {
    return type;
  }

  public Enum getColor() {
    return color;
  }
}
