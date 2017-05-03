package com.greenfox.modell;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BankAccount {
  String name;
  long balance;
  String animalType;
  boolean king;
  boolean goodGuy;
}
