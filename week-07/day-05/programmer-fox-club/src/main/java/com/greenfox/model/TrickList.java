package com.greenfox.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Component
public class TrickList {
  private List<Trick> tricks;

  public TrickList() {
    tricks = new ArrayList<>();
    tricks.add(new Trick("Say blabla", 99));
    tricks.add(new Trick("Say blabla again", 288));
  }
}
