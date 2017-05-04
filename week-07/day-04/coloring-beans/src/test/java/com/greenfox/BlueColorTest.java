package com.greenfox;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BlueColorTest {

  BlueColor blueColor = new BlueColor();

  @Test
  public void printColor() {
    String testString = "Hey here is the blue!";
    assertTrue(testString.equals(blueColor.printColor()));
  }
}
