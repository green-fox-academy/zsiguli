package com.greenfox.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Todos")
@Getter
@Setter
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String description;
  private boolean isUrgent;
  private boolean isDone;

  public Todo() {
  }

  public Todo(String description) {
    this.description = description;
  }

  public String toString() {
    return id + " - " + description;
  }
}
