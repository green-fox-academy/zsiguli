package com.greenfox;

import org.springframework.stereotype.Component;

@Component
public class BlueColor implements MyColor {
  @Override
  public String printColor() {
    String blue = "Hey here is the blue!";
    System.out.println(blue);
    return blue;
  }
}
