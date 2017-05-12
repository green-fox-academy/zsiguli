package com.greenfox.zsiguli.reddit.controller;

import com.greenfox.zsiguli.reddit.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {

  @Autowired
  Post post;

  @GetMapping("/posts")
  public Post sendBackAllAvailablePosts() {
    return post;
  }
}
