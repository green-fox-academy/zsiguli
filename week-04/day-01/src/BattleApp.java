public class BattleApp {
  public static void main(String[]args){
    Ship ship = new Ship();
    Ship ship2 = new Ship();
    ship.fillShip();
    ship2.fillShip();
    System.out.println("Before the battle:\n");
    System.out.println("First ship:");
    ship.stateOfShip();
    System.out.println("Second ship:");
    ship2.stateOfShip();
    ship.battle(ship2);
    System.out.println("After the battle:\n");
    System.out.println("First ship:");
    ship.stateOfShip();
    System.out.println("Second ship:");
    ship2.stateOfShip();
  }
}
