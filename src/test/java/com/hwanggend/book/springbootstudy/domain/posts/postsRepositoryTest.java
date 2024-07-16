package com.hwanggend.book.springbootstudy.domain.posts;

import com.hwanggend.book.springboot.domain.posts.posts;
import com.hwanggend.book.springboot.domain.posts.postsRepository;
import jakarta.persistence.Table;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Table(name = "posts")
public class postsRepositoryTest {

    @Autowired
    postsRepository postRepository;

    @After
    public void cleanup(){
        postRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기(){
        //given
        String title = "테스트게시글";
        String content = "테스트 본문";

        postRepository.save(posts.builder()
                .title(title)
                .content(content)
                .author("ghkdtjsdks@naver.com")
                .build());
        //When
        List<posts> postsList = postRepository.findAll();

        //then
        posts post = postsList.get(0);
        assertThat(post.getTitle()).isEqualTo(title);
        assertThat(post.getContent()).isEqualTo(content);
    }
}
