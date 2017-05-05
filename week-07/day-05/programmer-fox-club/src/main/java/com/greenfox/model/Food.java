package com.greenfox.model;

import lombok.Getter;

@Getter
public enum Food {
  BANANA("banana"), CHEESE("cheese"), PIZZA("pizza");

  private final String displayName;

  Food(String displayName) {
    this.displayName = displayName;
  }
}
