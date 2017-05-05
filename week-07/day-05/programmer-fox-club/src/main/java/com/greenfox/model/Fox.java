package com.greenfox.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
@Setter
public class Fox {
  private String name;
  private List<Trick> knownTricks;
  private Food food;
  private Drink drink;
  private boolean she;

  public Fox() {
    name = "Charles";
    knownTricks = new ArrayList<>();
    knownTricks.add(new Trick("this", 9));
    knownTricks.add(new Trick("that", 3));
    knownTricks.add(new Trick("final trick", 5));
    food = Food.PIZZA;
    drink = Drink.TEE;
    she = true;
  }
}
