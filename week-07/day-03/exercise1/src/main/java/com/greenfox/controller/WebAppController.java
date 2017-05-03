package com.greenfox.controller;

import com.greenfox.modell.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebAppController {

  @RequestMapping(value = "/exercise1")
  public static String simbasAccount(Model model) {
    BankAccount simba = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("simba", simba);
    return "simbasAccount";
  }

  @RequestMapping(value = "/exercise2")
  public static String balanceWithTwoDecimals(Model model) {
    BankAccount simba = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("simba", simba);
    return "simbasAccountWithTwoDecimals";
  }

  @RequestMapping(value = "/exercise3")
  public static String balanceWithZebra(Model model) {
    BankAccount simba = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("simba", simba);
    return "accountWithZebra";
  }

}
