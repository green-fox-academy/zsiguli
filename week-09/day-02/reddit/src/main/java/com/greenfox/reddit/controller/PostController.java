package com.greenfox.reddit.controller;

import com.greenfox.reddit.repository.PostRepository;
import com.greenfox.reddit.service.PostContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

  @Autowired
  PostRepository postRepository;

  @GetMapping("/posts")
  public PostContainer sendBackAllAvailablePosts() {
    return new PostContainer(postRepository.findAll());
  }
}
