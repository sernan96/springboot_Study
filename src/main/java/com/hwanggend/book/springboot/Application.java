package com.hwanggend.book.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.hwanggend.book.springboot.domain.posts"})
public class Application {
    public static void main(String [] args){
        SpringApplication.run(Application.class, args);//SpringApplication은 이제 main class임
    }
}
