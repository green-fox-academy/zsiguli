package com.greenfox.model;

import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
public class AppendA {

  String appended;

  public void setAppended(String appended) {
    this.appended = appended + "a";
  }
}
