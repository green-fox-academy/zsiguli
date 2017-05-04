package com.greenfox;

import org.springframework.stereotype.Component;

@Component
public class BlueColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("Hey here is the blue!");
  }
}
