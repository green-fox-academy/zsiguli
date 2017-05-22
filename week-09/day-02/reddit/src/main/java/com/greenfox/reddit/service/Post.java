package com.greenfox.reddit.service;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

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
  private Timestamp timestamp;
  private long score;
  private String owner;

  public Post() {
    this.title = "title";
    this.href = "href";
    this.timestamp = new Timestamp(System.currentTimeMillis());
    score = 0;
    owner = "anonymus";
  }

  public Post(String title, String href, String authenticatedUser) {
    this.title = title;
    this.href = href;
    this.timestamp = new Timestamp(System.currentTimeMillis());
    score = 0;
    owner = authenticatedUser;
  }

  public Post incScore() {
    ++score;
    return this;
  }

  public Post decScore() {
    --score;
    return this;
  }

  public Post modify(Post post) {
    title = post.title;
    href = post.href;
    return this;
  }
}
