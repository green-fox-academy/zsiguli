package com.greenfox.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Fox {
  private String name;
  private List<String> knownTricks;
  private String food;
  private String drink;
}
