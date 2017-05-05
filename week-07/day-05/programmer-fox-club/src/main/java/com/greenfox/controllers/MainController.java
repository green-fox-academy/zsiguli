package com.greenfox.controllers;

import com.greenfox.model.Drink;
import com.greenfox.model.Food;
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

  @GetMapping(value = "/nutritionStore")
  public String nutritionStore(Model model) {
    model.addAttribute("foods", Food.values());
    model.addAttribute("drinks", Drink.values());
    model.addAttribute("fox", fox);
    return "nutritionStore";
  }

  @GetMapping(value = "/operation")
  public String operation(Model model) {
    model.addAttribute("fox", fox);
    return "operation";
  }
}
