package com.greenfox.reddit.controller;

import com.greenfox.reddit.model.User;
import com.greenfox.reddit.repository.UserRepository;
import com.greenfox.reddit.service.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  @Autowired
  Session session;
  @Autowired
  UserRepository userRepository;

  @GetMapping("/")
  public String homePage() {
    return session.loginChecker();
  }

  @PostMapping("/authenticate")
  public String authenticate(@RequestParam("username") String username,
                             @RequestParam("password") String password) {
    if (userRepository.findOneByName(username).getPassword().equals(password)) {
      session.setAuthenticated(true);
      session.setUserName(username);
    }
    return "redirect:/";
  }

  @GetMapping("logout")
  public String logout() {
    session.setAuthenticated(false);
    return "redirect:/";
  }

  @PostMapping("/register")
  public String register(@RequestParam("username") String username, @RequestParam("password") String password) {
    if (userRepository.findOneByName(username) == null) {
      User user = new User(username, password);
      userRepository.save(user);
    } else {
      return "redirect:/error";
    }
    return "redirect:/";
  }

  @GetMapping("/register")
  public String register() {
    return "register";
  }

}
