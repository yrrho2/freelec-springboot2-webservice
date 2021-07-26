package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.comain.posts.Posts;
import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
@Getter
@RequiredArgsConstructor
public class HelloResponseDtoTest {
    @Test
    public void 롬복_기능_테스트(){
        String name="test";
        int amount=1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }

}
