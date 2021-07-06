package com.codewithfibbee.blog.repository;

import com.codewithfibbee.blog.domain.Post;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

/**
 * Spring Data Neo4j reactive repository for the Post entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PostRepository extends ReactiveNeo4jRepository<Post, String> {
    Flux<Post> findAllBy(Pageable pageable);
}
