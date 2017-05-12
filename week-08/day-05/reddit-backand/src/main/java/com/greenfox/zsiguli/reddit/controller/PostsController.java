package com.greenfox.zsiguli.reddit.controller;

import com.greenfox.zsiguli.reddit.model.Post;
import com.greenfox.zsiguli.reddit.model.PostContainer;
import com.greenfox.zsiguli.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {

  @Autowired
  PostRepository postRepository;

  @GetMapping("/posts")
  public PostContainer sendBackAllAvailablePosts() {
    return new PostContainer(postRepository.findAll());
  }

  @PostMapping("/posts")
  public Post addPost(@RequestBody Post post) {
    postRepository.save(post);
    return post;
  }
}
