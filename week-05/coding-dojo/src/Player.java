import java.util.*;

class Factory {
  int id;
  int owner;
  int population;
  int production;
  List<Integer> targets;

  public Factory(int id, int owner, int population, int production) {
    this.id = id;
    this.owner = owner;
    this.population = population;
    this.production = production;
    this.targets = new ArrayList<>();
  }

  public void initializeTargetFromArray(int[] targets) {
    for (Integer target : targets) {
      this.targets.add(target);
    }
  }
}

class Player {
  static Scanner in = new Scanner(System.in);

  public static int[][] initializeDistances() {
    int factoryCount = in.nextInt();
    int linkCount = in.nextInt();
    int[][] distancesBetweenFactories = new int[factoryCount][factoryCount];
    for (int i = 0; i < linkCount; i++) {
      int factory1 = in.nextInt();
      int factory2 = in.nextInt();
      int distance = in.nextInt();
      distancesBetweenFactories[factory1][factory2] = distance;
      distancesBetweenFactories[factory2][factory1] = distance;
    }
    return distancesBetweenFactories;
  }

  public static List<Factory> initializeFactories() {
    List<Factory> factories = new ArrayList<>();
    int entityCount = in.nextInt();
    for (int i = 0; i < entityCount; i++) {
      int entityId = in.nextInt();
      String entityType = in.next();
      int arg1 = in.nextInt();
      int arg2 = in.nextInt();
      int arg3 = in.nextInt();
      int arg4 = in.nextInt();
      int arg5 = in.nextInt();

      if (entityType.equals("FACTORY")) {
        factories.add(new Factory(entityId, arg1, arg2, arg3));
      }
    }
    return factories;
  }

  public static void main(String args[]) {

    int[][] distancesBetweenFactories = Player.initializeDistances();

    while (true) {
      List<Factory> factories = initializeFactories();

      double bestTarget = 100;
      int source;
      int destination = -5;
      int cyborgCount;
      String finalOrder = new String();

      for (Factory factory : factories) {
        factory.initializeTargetFromArray(distancesBetweenFactories[factory.id]);
        if (factory.owner == 1) {
          for (int i = 0; i < factory.targets.size(); ++i) {
            int currentTargetDistance = factory.targets.get(i);
            int currentTargetOwner = factories.get(i).owner;
            int currentTargetProduction = factories.get(i).production;
            double currentTarget = currentTargetDistance - currentTargetProduction;
            if (currentTarget < bestTarget && currentTargetOwner != 1 && currentTargetProduction != 0) {
              bestTarget = currentTarget;
              destination = factories.get(i).id;
            }
          }
          source = factory.id;
          if (factory.population > 10) {
            if (factories.get(destination).owner == 0) {
              cyborgCount = factories.get(destination).population + 1;
            } else {
              cyborgCount = factory.population / 5 + 3;
            }
          } else {
            continue;
          }
          if (source == destination || destination == -5) {
//          } else if (factory.population > 15 && factory.production < 3) {
//            finalOrder += ";INC " + source;
          } else {
            finalOrder += (";MOVE " + source + " " + destination + " " + cyborgCount);
          }
        }
      }
      finalOrder = finalOrder.replaceFirst(";", "");
      if (finalOrder.length() < 1) {
        System.out.println("WAIT");
      } else {
        System.out.println(finalOrder);
      }
    }
  }
}
