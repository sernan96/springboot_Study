package com.hwanggend.book.springbootstudy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootTest
@EnableJpaRepositories(basePackages = "com.hwanggend.book.springboot.domain.posts")
@ComponentScan(basePackages = "com.hwanggend.book.springboot.domain.posts")
class SpringbootStudyApplicationTests {

    @Test
    void contextLoads() {
    }

}
