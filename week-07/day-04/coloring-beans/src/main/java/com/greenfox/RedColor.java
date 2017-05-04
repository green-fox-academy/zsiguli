package com.greenfox;

import org.springframework.stereotype.Component;

@Component
public class RedColor implements MyColor{
  @Override
  public void printColor() {
    System.out.println("I'am the red one!");
  }
}
