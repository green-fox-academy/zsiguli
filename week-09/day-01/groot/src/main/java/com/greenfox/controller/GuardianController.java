package com.greenfox.controller;

import com.greenfox.service.Arrow;
import com.greenfox.service.Cargo;
import com.greenfox.service.ErrorMessage;
import com.greenfox.service.Groot;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage error() {
    return new ErrorMessage();
  }

  @GetMapping("/groot")
  public Groot translate(@RequestParam(name = "message") String received) {
    return new Groot(received);
  }

  @GetMapping("/yondu")
  public Arrow arrow(@RequestParam("distance") double distance, @RequestParam("time") double time) {
    return new Arrow(distance, time);
  }

  @GetMapping("/rocket")
  public Cargo cargoStatus() {
    return new Cargo();
  }
}
