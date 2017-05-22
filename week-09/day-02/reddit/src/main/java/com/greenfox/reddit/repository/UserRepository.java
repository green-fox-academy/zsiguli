package com.greenfox.reddit.repository;

import com.greenfox.reddit.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
  User findOneByName(String username);
}
