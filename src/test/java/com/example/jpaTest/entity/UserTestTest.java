package com.example.jpaTest.entity;

import com.example.jpaTest.repository.UserTestRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;

//통합 테스트 진행용
@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class UserTestTest {
    @Autowired
    UserTestRepository userTestRepository;

    @Test
    @DisplayName("UserTest 테이블 입력 테스트")
    void userTestInput(){
        UserTest user = new UserTest();
        user.setName("카리나");
        user.setEmail("karina@easpa.com");
        userTestRepository.save(user);

    }

@Test
@DisplayName("테이블 수정 테스트")
    void userTestUpdate(){
        //
    UserTest ka = userTestRepository.findById(1L).orElse(null);

    //2 이메일 수정
    ka.setEmail("karina@b.c");
    userTestRepository.save(ka);
}

}