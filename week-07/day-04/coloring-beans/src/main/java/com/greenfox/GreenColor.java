package com.greenfox;

import org.springframework.stereotype.Component;

@Component
public class GreenColor implements MyColor {
  @Override
  public String printColor() {
    String green = "Green at your service!";
    System.out.println(green);
    return green;
  }
}
