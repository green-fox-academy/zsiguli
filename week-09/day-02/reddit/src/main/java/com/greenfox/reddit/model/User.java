package com.greenfox.reddit.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Getter
public class User {

  @Id
  private String name;
  private String password;
  @Setter
  private ArrayList<Long> votes;

  public User(String name, String password) {
    this.name = name;
    this.password = password;
    votes = new ArrayList<>();
  }
}
