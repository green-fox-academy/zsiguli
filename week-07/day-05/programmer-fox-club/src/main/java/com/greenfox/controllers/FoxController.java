package com.greenfox.controllers;

import com.greenfox.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

  @Autowired
  Fox fox;
  @Autowired
  TrickList availableTricks;

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

  @PostMapping(value = "/learnTrick")
  public String learnTrick(@RequestParam("description") String description,
                           @RequestParam("difficulty") int difficulty) {
    Trick actual = new Trick(description, difficulty);
    fox.learnNewTrick(actual);
    availableTricks.removeTrick(actual);
    return "redirect:/trickCenter";
  }
}
