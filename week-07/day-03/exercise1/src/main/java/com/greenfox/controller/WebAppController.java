package com.greenfox.controller;

import com.greenfox.modell.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

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

  @RequestMapping(value = "/exercise5")
  public static String manyBankAccounts(Model model) {
    List<BankAccount> accounts = new ArrayList<>();
    accounts.add(new BankAccount("Simba", 2000, "lion"));
    accounts.add(new BankAccount("Pumba", 10000, "warthog"));
    accounts.add(new BankAccount("Rafiki", 100, "monkey"));
    accounts.add(new BankAccount("Zazu", 2000, "bird"));
    model.addAttribute("accounts", accounts);
    return "manyBankAccounts";
  }

  @RequestMapping(value = "/exercise6")
  public static String manyBankAccountsWithNumbers(Model model) {
    List<BankAccount> accounts = new ArrayList<>();
    accounts.add(new BankAccount("Simba", 2000, "lion"));
    accounts.add(new BankAccount("Pumba", 10000, "warthog"));
    accounts.add(new BankAccount("Rafiki", 100, "monkey"));
    accounts.add(new BankAccount("Zazu", 2000, "bird"));
    model.addAttribute("accounts", accounts);
    return "manyBankAccountsWithNumbers";
  }

  @RequestMapping(value = "/exercise7")
  public static String manyBankAccountsWithNumbersAndKing(Model model) {
    List<BankAccount> accounts = new ArrayList<>();
    accounts.add(new BankAccount("Simba", 2000, "lion"));
    accounts.add(new BankAccount("Pumba", 10000, "warthog"));
    accounts.add(new BankAccount("Rafiki", 100, "monkey"));
    accounts.add(new BankAccount("Zazu", 2000, "bird"));
    model.addAttribute("accounts", accounts);
    return "manyBankAccountsWithNumbersAndKing";
  }

}
