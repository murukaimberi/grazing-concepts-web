package com.grazingconcepts.grazingconceptsweb.repository;

import com.grazingconcepts.grazingconceptsweb.model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

public interface CommentRepository extends MongoRepository<Comment, String> {
}
