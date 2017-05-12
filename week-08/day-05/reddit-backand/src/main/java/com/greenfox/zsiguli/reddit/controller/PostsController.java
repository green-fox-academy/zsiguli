package com.greenfox.zsiguli.reddit.controller;

import com.greenfox.zsiguli.reddit.model.Post;
import com.greenfox.zsiguli.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {

  @Autowired
  PostRepository postRepository;

  @GetMapping("/posts")
  public Iterable<Post> sendBackAllAvailablePosts() {
    return postRepository.findAll();
  }
}
