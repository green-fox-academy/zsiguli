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
  private boolean authenticated;

  public Fox() {
    name = "Charles";
    knownTricks = new ArrayList<>();
    food = Food.PIZZA;
    drink = Drink.TEE;
    she = false;
    authenticated = false;
  }

  public void learnNewTrick(Trick trick) {
    knownTricks.add(trick);
  }
}
