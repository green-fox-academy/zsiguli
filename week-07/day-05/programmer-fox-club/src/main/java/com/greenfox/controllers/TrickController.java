package com.greenfox.controllers;

import com.greenfox.model.TrickList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrickController {

  @Autowired
  TrickList availableTricks;

  @PostMapping(value = "/learnTrick")
  public String learnTrick() {
    System.out.println("working");
    return "redirect:/trickCenter";
  }
}
