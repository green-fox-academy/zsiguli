public class BattleApp {
  public static void main(String[]args){
    Ship ship = new Ship();
    Ship ship2 = new Ship();
    ship.fillShip();
    ship2.fillShip();
    ship.battle(ship2);
  }
}
