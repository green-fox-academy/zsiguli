package com.greenfox.reddit.controller;

import com.greenfox.reddit.service.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  Session session;

  @GetMapping("/")
  public String homePage() {
    return session.loginChecker();
  }

  @PostMapping("/authenticate")
  public String authenticate(@RequestParam("username") String username, @RequestParam("password") String password) {
    if (true) {
      session.setAuthenticated(true);
      session.setUserName(username);
    }
    System.out.println(username + ", " + password);
    return "redirect:/";
  }

  @GetMapping("logout")
  public String logout() {
    session.setAuthenticated(false);
    return "redirect:/";
  }
}
