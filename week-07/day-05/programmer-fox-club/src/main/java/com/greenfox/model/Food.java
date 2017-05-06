package com.greenfox.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Food {
  BANANA("banana"), CHEESE("cheese"), PIZZA("pizza"), ICE_CREAM("ice cream");

  private final String displayName;
}
