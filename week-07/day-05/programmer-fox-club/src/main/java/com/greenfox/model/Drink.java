package com.greenfox.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Drink {
  BEER("beer"), WATER("water"), TEE("tee");

  private final String displayName;
}