package com.greenfox.controller;

import com.greenfox.service.Groot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public Groot translate(@RequestParam(name = "message") String received) {
    return new Groot(received);
  }
}
