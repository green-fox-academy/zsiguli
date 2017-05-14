package com.greenfox.zsiguli.reddit.controller;

import com.greenfox.zsiguli.reddit.model.Post;
import com.greenfox.zsiguli.reddit.model.PostContainer;
import com.greenfox.zsiguli.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

  @PutMapping("/posts/{id}/upvote")
  public Post upVote(@PathVariable int id) {
    PostContainer postContainer = new PostContainer(postRepository.findAll());
    Post postToReturn = new Post();
    for (Post post : postContainer.getPosts()) {
      if (post.getId() == id) {
        post.setScore(post.getScore() + 1);
        postRepository.save(post);
        postToReturn = post;
      }
    }
    return postToReturn;
  }

  @PutMapping("/posts/{id}/downvote")
  public Post downVote(@PathVariable int id) {
    PostContainer postContainer = new PostContainer(postRepository.findAll());
    Post postToReturn = new Post();
    for (Post post : postContainer.getPosts()) {
      if (post.getId() == id) {
        post.setScore(post.getScore() - 1);
        postRepository.save(post);
        postToReturn = post;
      }
    }
    return postToReturn;
  }

  @DeleteMapping("/posts/{id}")
  public Post deletePost(@PathVariable int id) {
    PostContainer postContainer = new PostContainer(postRepository.findAll());
    Post postToReturn = new Post();
    for (Post post : postContainer.getPosts()) {
      if (post.getId() == id) {
        postRepository.delete(post);
        postToReturn = post;
      }
    }
    return postToReturn;
  }
}
