package com.greenfox.zsiguli.reddit.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
@Setter
@Getter
public class Post {

  private static AtomicLong idController;

  private long id;
  private String title;
  private String href;
  private long score;

  public Post(String title, String href) {
    id = idController.getAndIncrement();
    this.title = title;
    this.href = href;
    score = 0;
  }

}
