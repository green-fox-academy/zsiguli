package com.greenfox.model;


import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
public class Greeting {
  String welcome_message;

  public Greeting() {
    welcome_message = "Oh, hi there petike, my dear student!";
  }
}
