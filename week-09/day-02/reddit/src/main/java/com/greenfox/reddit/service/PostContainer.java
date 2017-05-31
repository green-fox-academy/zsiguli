package com.greenfox.reddit.service;

import com.greenfox.reddit.model.User;
import com.greenfox.reddit.repository.PostRepository;
import com.greenfox.reddit.repository.UserRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Getter
@NoArgsConstructor
@Service
public class PostContainer {

  @Autowired
  PostRepository postRepository;
  @Autowired
  UserRepository userRepository;
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
    post.setTitle(post.getTitle().replaceAll("[:;./)(<>'\"=]" , ""));
    postRepository.save(post);
    return post;
  }

  public Post upVote(long id) {
    User tempUser = userRepository.findOneByName(session.getUserName());
    ArrayList<Long> votes = tempUser.getVotes();
    Post toUpVote = postRepository.findOneById(id);
    toUpVote.setTitle(toUpVote.getTitle().replaceAll("[:;./)(<>'\"=]" , ""));
    if (votes.contains(id)) {
    } else if (votes.contains(-id)) {
      toUpVote.incScore();
      votes.remove(-id);
      tempUser.setVotes(votes);
      userRepository.save(tempUser);
    } else {
      toUpVote.incScore();
      votes.add(id);
      tempUser.setVotes(votes);
      userRepository.save(tempUser);
    }
    postRepository.save(toUpVote);
    return toUpVote;
  }

  public Post downVote(long id) {
    User tempUser = userRepository.findOneByName(session.getUserName());
    ArrayList<Long> votes = tempUser.getVotes();
    Post toDownVote = postRepository.findOneById(id);
    toDownVote.setTitle(toDownVote.getTitle().replaceAll("[:;./)(<>'\"=]" , ""));
    if (votes.contains(-id)) {
    } else if (votes.contains(id)) {
      toDownVote.decScore();
      votes.remove(id);
      tempUser.setVotes(votes);
      userRepository.save(tempUser);
    } else {
      toDownVote.decScore();
      votes.add(-id);
      tempUser.setVotes(votes);
      userRepository.save(tempUser);
    }
    postRepository.save(toDownVote);
    return toDownVote;
  }

  public Post delete(long id) {
    Post toDelete = postRepository.findOneById(id);
    if (session.getUserName().equals(postRepository.findOneById(id).getOwner())) {
      postRepository.delete(id);
    }
    return toDelete;
  }

  public Post modify(long id, Post post) {
    Post modified = postRepository.findOneById(id).modify(post);
    postRepository.save(modified);
    return modified;
  }
}
