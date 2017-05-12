package com.greenfox.zsiguli.reddit.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "reddit")

public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private String href;
  private long score;

  public Post() {
    this.title = "title";
    this.href = "href";
    score = 0;
  }

  public Post(String title, String href) {
    this.title = title;
    this.href = href;
    score = 0;
  }
}
