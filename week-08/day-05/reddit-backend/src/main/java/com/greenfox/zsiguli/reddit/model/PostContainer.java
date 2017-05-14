package com.greenfox.zsiguli.reddit.model;

import lombok.Getter;

@Getter
public class PostContainer {

  private Iterable<Post> posts  ;

  public PostContainer(Iterable<Post> posts) {
    this.posts = posts;
  }
}
