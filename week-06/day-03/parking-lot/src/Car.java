public class Car {

  private Type type;
  private Color color;

  public Car() {
    type = Type.values()[(int) (Math.random() * Type.values().length)];
    color = Color.values()[(int) (Math.random() * Color.values().length)];
  }

  public Enum getType() {
    return type;
  }

  public Enum getColor() {
    return color;
  }
}
