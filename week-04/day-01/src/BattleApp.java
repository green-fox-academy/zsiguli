public class BattleApp {
  public static void main(String[]args){
    Ship ship = new Ship();
    Ship ship2 = new Ship();
    ship.fillShip();
    ship2.fillShip();
    System.out.println("Before the battle: ");
    ship.stateOfShip();
    ship2.stateOfShip();
    ship.battle(ship2);
    System.out.println("After the battle: ");
    ship.stateOfShip();
    ship2.stateOfShip();
  }
}
