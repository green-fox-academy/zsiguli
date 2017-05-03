package com.greenfox.modell;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BankAccount {
  String name;
  long balance;
  String animalType;
}
