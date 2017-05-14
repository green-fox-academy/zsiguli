package com.greenfox.zsiguli.reddit.repository;

import com.greenfox.zsiguli.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
