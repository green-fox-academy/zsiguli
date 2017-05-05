package com.greenfox.controllers;

import com.greenfox.model.Drink;
import com.greenfox.model.Food;
import com.greenfox.model.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

  @Autowired
  Fox fox;

  @PostMapping(value = "/changeFood")
  public String changeFood(@RequestParam("food") Food food) {
    fox.setFood(food);
    return "redirect:/nutritionStore";
  }

  @PostMapping(value = "/changeDrink")
  public String changeDrink(@RequestParam("drink") Drink drink) {
    fox.setDrink(drink);
    return "redirect:/nutritionStore";
  }

  @PostMapping(value = "/operation")
  public String operate(@RequestParam("she") boolean bool) {
    fox.setShe(bool);
    return "redirect:/operation";
  }
}
