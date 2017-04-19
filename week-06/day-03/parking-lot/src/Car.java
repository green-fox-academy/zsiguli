public class Car {

  private Type type;
  private Color color;

  public Car() {
    type = Type.values()[(int) (Math.random() * Type.values().length)];
    color = Color.values()[(int) (Math.random() * Color.values().length)];
  }

  public Type getType() {
    return type;
  }

  public Color getColor() {
    return color;
  }
}
