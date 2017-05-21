package com.greenfox.reddit.service;

import lombok.Setter;
import org.springframework.stereotype.Service;

@Setter
@Service
public class Session {

  String userName;
  boolean authenticated;

  public String loginChecker() {
    if (authenticated) {
      return "index";
    } else {
      return "login";
    }
  }
}
