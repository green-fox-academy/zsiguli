package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {
  @RequestMapping("/web/greeting")
  static public String greeting(Model model, @RequestParam("name") String name) {
    model.addAttribute("name", name);
    model.addAttribute("loadCounter", HelloRESTController.numberOfRequests.incrementAndGet());
    return "greeting";
  }
}
