package com.greenfox.model;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Getter
public class Fox {
  private String name;
  private List<String> knownTricks;
  private String food;
  private String drink;

  public Fox() {
    knownTricks = new ArrayList<>();
    knownTricks.add("this");
    knownTricks.add("that");
  }
}
