package com.codewithfibbee.blog;

import com.codewithfibbee.blog.AbstractNeo4jIT;
import com.codewithfibbee.blog.BlogApp;
import com.codewithfibbee.blog.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { BlogApp.class, TestSecurityConfiguration.class })
@ExtendWith(AbstractNeo4jIT.class)
public @interface IntegrationTest {
}
