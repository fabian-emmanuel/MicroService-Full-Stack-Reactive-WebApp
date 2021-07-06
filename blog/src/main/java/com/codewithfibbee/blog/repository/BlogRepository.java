package com.codewithfibbee.blog.repository;

import com.codewithfibbee.blog.domain.Blog;
import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

/**
 * Spring Data Neo4j reactive repository for the Blog entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BlogRepository extends ReactiveNeo4jRepository<Blog, String> {}
