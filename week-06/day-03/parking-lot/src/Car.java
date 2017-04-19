public class Car {

  private Enum type;

  private Enum color;
  public Car() {
    type = Type.MERCEDES;
    color = Color.BLACK;
  }

  public Enum getType() {
    return type;
  }

  public Enum getColor() {
    return color;
  }


}
