package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  static AtomicLong numberOfRequests = new AtomicLong();
  @RequestMapping(value = "/greeting")
  static public Greeting greeting(@RequestParam("name") String name) {
    Greeting greeting = new Greeting(numberOfRequests.incrementAndGet(), "Hello " + name);
    return greeting;
  }
}
