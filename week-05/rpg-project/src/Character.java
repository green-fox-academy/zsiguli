public class Character {
  String costumeImage;
  int actualPositionX;
  int actualPositionY;

  public Character() {
    this.actualPositionX = 0;
    this.actualPositionY = 0;
  }

  public Character(int actualPositionX, int actualPositionY) {
    this.actualPositionX = actualPositionX;
    this.actualPositionY = actualPositionY;
  }

  public String getCostumeImage() {
    return costumeImage;
  }

  public void setCostumeImage(String costumeImage) {
    this.costumeImage = costumeImage;
  }

  public int getActualPositionX() {
    return actualPositionX;
  }

  public int getActualPositionY() {
    return actualPositionY;
  }

  public void moveUp() {

  }

  public void moveDown() {

  }

  public void moveRight() {

  }

  public void moveLeft() {

  }
}