package com.greenfox;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RedColor implements MyColor{
  @Override
  public String printColor() {
    String red = "I'am the red one!";
    System.out.println(red);
    return red;
  }
}
