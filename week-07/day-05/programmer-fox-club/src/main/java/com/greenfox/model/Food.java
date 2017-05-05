package com.greenfox.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Food {
  BANANA("banana"), CHEESE("cheese"), PIZZA("pizza");

  private final String displayName;
}
