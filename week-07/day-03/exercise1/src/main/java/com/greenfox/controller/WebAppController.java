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

  @RequestMapping(value = "/exercise4")
  public static String twoDifferentTextType(Model model) {
    String content = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("content", content);
    return "twoDifferentTextType";
  }

}
