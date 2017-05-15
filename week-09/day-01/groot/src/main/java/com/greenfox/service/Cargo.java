package com.greenfox.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cargo {
  private int caliber25;
  private int caliber30;
  private int caliber50;
  private String shipstatus;
  private boolean ready;

  public Cargo() {
    caliber25 = 0;
    caliber30 = 0;
    caliber50 = 0;
    shipstatus = "empty";
    ready = false;
  }
}
