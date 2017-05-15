package com.greenfox.service;

import lombok.Getter;

@Getter
public class ErrorMessage {
  private String error;

  public ErrorMessage() {
    error = "I am groot!";
  }
}
