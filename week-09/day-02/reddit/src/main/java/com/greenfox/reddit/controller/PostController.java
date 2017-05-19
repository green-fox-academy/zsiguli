package com.greenfox.reddit.controller;

import com.greenfox.reddit.repository.PostRepository;
import com.greenfox.reddit.service.Post;
import com.greenfox.reddit.service.PostContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

  @Autowired
  PostRepository postRepository;

  @Autowired
  PostContainer postContainer;

  @GetMapping("/posts")
  public PostContainer sendBackAllAvailablePosts() {
    return postContainer.findAllAvailablePosts();
  }

  @PostMapping("/posts")
  public Post addPost(@RequestBody Post post) {
    return postContainer.addPost(post);
  }

  @PutMapping("/posts/{id}/upvote")
  public Post upVote(@PathVariable long id) {
    return postContainer.upVote(id);
  }

  @PutMapping("/posts/{id}/downvote")
  public Post downVote(@PathVariable long id) {
    return postContainer.downVote(id);
  }

  @DeleteMapping("/posts/{id}")
  public Post deletePost(@PathVariable long id) {
    PostContainer postContainer = new PostContainer(postRepository.findAllByOrderByScoreDesc());
    postRepository.delete(postContainer.findSelected(id));
    return postContainer.findSelected(id);
  }

  @PostMapping("/posts/{id}")
  public Post modifyPost(@PathVariable long id, @RequestBody Post post) {
    PostContainer postContainer = new PostContainer(postRepository.findAllByOrderByScoreDesc());
    postRepository.save(postContainer.findSelected(id).modify(post));
    return postContainer.findSelected(id);
  }
}
