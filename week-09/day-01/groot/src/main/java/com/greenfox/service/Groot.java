package com.greenfox.service;

import lombok.Getter;

@Getter
public class Groot {
  private String received;
  private String translated;

  public Groot(String receivedMessage) {
    received = receivedMessage;
    translated = "I am groot!";
  }
}
