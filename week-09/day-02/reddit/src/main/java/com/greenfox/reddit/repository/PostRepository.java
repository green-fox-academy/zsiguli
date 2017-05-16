package com.greenfox.reddit.repository;

import com.greenfox.reddit.service.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
