package com.greenfox.model;

import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
@Getter
public class DoUntilError {

  String error;

  DoUntilError() {
    error = "Please provide a number!";
  }
}
