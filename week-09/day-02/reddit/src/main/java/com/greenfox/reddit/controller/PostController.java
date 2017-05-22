package com.greenfox.reddit.controller;

import com.greenfox.reddit.service.Post;
import com.greenfox.reddit.service.PostContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

  @Autowired
  PostContainer postContainer;

  @GetMapping("/posts")
  public PostContainer sendBackAllAvailablePosts() {
    return postContainer.findAllAvailablePosts();
  }

  @PostMapping("/posts")
  public Post addPost(@RequestBody Post post) {
    return postContainer.add(post);
  }

  @PutMapping("/posts/{id}/upvote")
  public Post upVotePost(@PathVariable long id) {
    return postContainer.upVote(id);
  }

  @PutMapping("/posts/{id}/downvote")
  public Post downVotePost(@PathVariable long id) {
    return postContainer.downVote(id);
  }

  @DeleteMapping("/posts/{id}")
  public Post deletePost(@PathVariable long id) {
    return postContainer.delete(id);
  }

  @PostMapping("/posts/{id}")
  public Post modifyPost(@PathVariable long id, @RequestBody Post post) {
    return postContainer.modify(id, post);
  }
  }
