package com.greenfox.service;

import lombok.Getter;

@Getter
public class Arrow {
  double distance;
  double time;
  double speed;

  public Arrow(double distance, double time) {
    this.distance = distance;
    this.time = time;
    speed = distance / time;
  }
}
