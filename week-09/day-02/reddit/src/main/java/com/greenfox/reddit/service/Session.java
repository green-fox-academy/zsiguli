package com.greenfox.reddit.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
@Scope(value="session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Session {

  private String userName;
  private boolean authenticated;

  public String loginChecker() {
    return authenticated ? "index" : "login";
  }
}
