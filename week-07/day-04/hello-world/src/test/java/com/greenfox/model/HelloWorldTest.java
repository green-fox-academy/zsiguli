package com.greenfox.model;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class HelloWorldTest {

  HelloWorld helloWorld = new HelloWorld();

  @Test
  public void setMessageTest() {
    String testString = "Hello World!";
    helloWorld.setMessage("Hello World!");
    assertTrue(testString.equals(helloWorld.getMessage()));
  }
}
