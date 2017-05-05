package com.greenfox.model;

import lombok.Getter;

@Getter
public enum Drink {
  BEER("beer"), WATER("water"), TEE("tee");

  private final String displayName;

  Drink(String displayName) {
    this.displayName = displayName;
  }
}
