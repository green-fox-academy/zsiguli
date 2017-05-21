package com.greenfox.reddit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @GetMapping("/")
  public String homePage() {
    if (8 < 3) {
      return "index";
    } else {
      return "login";
    }
  }
}
