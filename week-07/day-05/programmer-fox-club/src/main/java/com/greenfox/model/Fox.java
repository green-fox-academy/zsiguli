package com.greenfox.model;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class Fox {
  private String name;
  private List<Trick> knownTricks;
  private String food;
  private String drink;
  private boolean mr;

  public Fox() {
    knownTricks = new ArrayList<>();
    knownTricks.add(new Trick("this", 9));
    knownTricks.add(new Trick("that", 3));
    knownTricks.add(new Trick("final trick", 5));
  }
}
