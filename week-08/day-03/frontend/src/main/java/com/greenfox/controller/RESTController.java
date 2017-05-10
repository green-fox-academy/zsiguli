package com.greenfox.controller;

import com.greenfox.model.DoubleService;
import com.greenfox.model.ErrorMessage;
import com.greenfox.model.Greeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {

  @Autowired
  private ErrorMessage errorMessage;
  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage exceptionHandling(MissingServletRequestParameterException ex) {
    errorMessage.setError(createErrorMessage(ex.getParameterName()));
    return errorMessage;
  }

  private String createErrorMessage(String error) {
    String errorMessage = "Please provide ";
    if (isVowel(error.charAt(0))) {
      errorMessage += "an ";
    } else {
      errorMessage += "a ";
    }
    errorMessage += error + "!";
    return errorMessage;
  }

  private boolean isVowel(char c) {
    if (c == 'a') {
      return true;
    } else if (c == 'e') {
      return true;
    } else if (c == 'i') {
      return true;
    } else if (c == 'o') {
      return true;
    } else if (c == 'u') {
      return true;
    } else return false;
  }

  @Autowired
  private DoubleService doubleService;

  @GetMapping("/doubling")
  public DoubleService doubling(@RequestParam("input") int inputNumber) {
    doubleService.setReceived(inputNumber);
    doubleService.setResult(inputNumber * 2);
    return doubleService;
  }

  @Autowired
  Greeting greeting;

  @GetMapping("/greeter")
  public Greeting greet(@RequestParam("name") String name, @RequestParam("title") String title) {
    return greeting;
  }
}
