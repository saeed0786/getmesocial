package com.example.getmesocial.repository;

import com.example.getmesocial.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface UserRepository extends MongoRepository<User, String> {

}
