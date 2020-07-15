package com.grazingconcepts.grazingconceptsweb.repository;

import com.grazingconcepts.grazingconceptsweb.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface PostRepository extends MongoRepository<Post, String> {
}
