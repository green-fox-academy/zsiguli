package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
  @RequestMapping(value = "/greeting")
  static public Greeting greeting(@RequestParam("name") String name) {
    Greeting greeting = new Greeting(1, "Hello " + name);
    return greeting;
  }
}
