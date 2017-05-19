package com.greenfox.reddit.service;

import com.greenfox.reddit.repository.PostRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@NoArgsConstructor
@Service
public class PostContainer {

  @Autowired
  PostRepository postRepository;

  private Iterable<Post> posts;

  public PostContainer(Iterable<Post> posts) {
    this.posts = posts;
  }

  public PostContainer findAllAvailablePosts() {
    return new PostContainer(postRepository.findAllByOrderByScoreDesc());
  }

  public Post addPost(Post post) {
    postRepository.save(post);
    return post;
  }

  public Post upVote(long id) {
    posts = postRepository.findAllByOrderByScoreDesc();
    Post upVoted = findSelected(id).incScore();
    postRepository.save(upVoted);
    return upVoted;
  }

  public Post downVote(long id) {
    posts = postRepository.findAllByOrderByScoreDesc();
    Post downVoted = findSelected(id).decScore();
    postRepository.save(downVoted);
    return downVoted;
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
