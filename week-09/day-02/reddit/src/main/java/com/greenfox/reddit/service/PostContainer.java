package com.greenfox.reddit.service;

import lombok.Getter;

@Getter
public class PostContainer {

  private Iterable<Post> posts;

  public PostContainer(Iterable<Post> posts) {
    this.posts = posts;
  }

  public Post findSelected(long id) {
    for (Post post : posts) {
      if (post.getId() == id) {
        return post;
      }
    }
    return new Post();
  }
}
