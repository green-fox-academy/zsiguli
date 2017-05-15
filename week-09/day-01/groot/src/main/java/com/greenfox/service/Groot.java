package com.greenfox.service;

import lombok.Getter;

@Getter
public class Groot {
  String received;
  String translated;

  public Groot(String receivedMessage) {
    received = receivedMessage;
    translated = "I' am groot!";
  }
}
