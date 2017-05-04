package com.greenfox.controller;

import com.greenfox.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  @Autowired
  Fox fox;

  @GetMapping(value = "/")
  public String homePage(Model model) {
    model.addAttribute("fox", fox);
    return "index";
  }
}
