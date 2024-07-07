package com.hwanggend.book.springbootstudy.web.dto;

import com.hwanggend.book.springboot.web.dto.HelloResponseDto;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void lombokTest(){
        //given
        String name = "test";
        int amount =1000;
        
        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);
        
        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
        //assertj라는 테스트 검증 라이브러리 검증 메소드임 자동완성이 더 확실히 지원됨
    }
}
