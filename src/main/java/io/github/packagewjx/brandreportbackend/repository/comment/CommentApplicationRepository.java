package io.github.packagewjx.brandreportbackend.repository.comment;

import io.github.packagewjx.brandreportbackend.domain.comment.CommentApplication;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentApplicationRepository extends MongoRepository<CommentApplication, String> {
}