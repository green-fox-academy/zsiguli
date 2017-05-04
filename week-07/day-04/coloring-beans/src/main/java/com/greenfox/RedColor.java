package com.greenfox;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RedColor implements MyColor{
  @Override
  public void printColor() {
    System.out.println("I'am the red one!");
  }
}
