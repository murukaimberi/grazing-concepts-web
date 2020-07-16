package com.grazingconcepts.grazingconceptsweb.repository;

import com.grazingconcepts.grazingconceptsweb.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

public interface UserRepository extends MongoRepository<User, String> {
}
