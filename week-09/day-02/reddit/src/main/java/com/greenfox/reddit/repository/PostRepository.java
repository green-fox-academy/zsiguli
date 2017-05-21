package com.greenfox.reddit.repository;

import com.greenfox.reddit.service.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {
  Iterable<Post> findAllByOrderByScoreDesc();
  Post findOneById(Long id);
}
