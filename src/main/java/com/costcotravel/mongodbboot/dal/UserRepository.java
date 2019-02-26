package com.costcotravel.mongodbboot.dal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.costcotravel.mongodbboot.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
