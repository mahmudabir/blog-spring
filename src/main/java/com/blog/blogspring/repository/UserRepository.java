package com.blog.blogspring.repository;

import com.blog.blogspring.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
