public class WarApp {
  public static void main(String[]args){
    Armada armada1 = new Armada();
    Armada armada2 = new Armada();
    armada1.fillArmada();
    armada2.fillArmada();
    armada1.war(armada2);
  }
}
