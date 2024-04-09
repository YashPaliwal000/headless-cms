package com.headless.cms.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.headless.cms.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {

    User findByUsername(String username);

}
