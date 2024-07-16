package com.hwanggend.book.springbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.hwanggend.book.springboot.domain.posts")
@ComponentScan(basePackages = "com.hwanggend.book.springboot.domain.posts")
@EntityScan(basePackages = "com.hwanggend.book.springboot.domain.posts")
public class SpringbootStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudyApplication.class, args);
    }
    //hi
}
