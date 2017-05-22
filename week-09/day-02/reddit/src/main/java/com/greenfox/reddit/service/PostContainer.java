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
  @Autowired
  Session session;

  private Iterable<Post> posts;

  public PostContainer(Iterable<Post> posts) {
    this.posts = posts;
  }

  public PostContainer findAllAvailablePosts() {
    return new PostContainer(postRepository.findAllByOrderByScoreDesc());
  }

  public Post add(Post post) {
    post.setOwner(session.getUserName());
    postRepository.save(post);
    return post;
  }

  public Post upVote(long id) {
    Post upVoted = postRepository.findOneById(id).incScore();
    postRepository.save(upVoted);
    return upVoted;
  }

  public Post downVote(long id) {
    Post downVoted = postRepository.findOneById(id).decScore();
    postRepository.save(downVoted);
    return downVoted;
  }

  public Post delete(long id) {
    Post deleted = postRepository.findOneById(id);
    postRepository.delete(id);
    return deleted;
  }

  public Post modify(long id, Post post) {
    Post modified = postRepository.findOneById(id).modify(post);
    postRepository.save(modified);
    return modified;
  }
}
