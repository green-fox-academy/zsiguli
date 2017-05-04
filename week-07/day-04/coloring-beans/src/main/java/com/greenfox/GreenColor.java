package com.greenfox;

import org.springframework.stereotype.Component;

@Component
public class GreenColor implements MyColor {
  @Override
  public void printColor() {
    System.out.println("Green at your service!");
  }
}
