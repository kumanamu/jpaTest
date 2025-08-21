package com.example.jpaTest.entity;

import com.example.jpaTest.dto.Gender;
import com.example.jpaTest.repository.UsersRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class UsersTest {
    @Autowired
    UsersRepository repository;


    @Test
    @DisplayName("새로운 user입력하기 테스트지롱")
    void userInputTest(){
        //현재의 테이블레코드 수를 출력
        System.out.println("데이터 추가이전 " + repository.count());
        //빌더를 이용한 클래스 생성
        Users users = Users.builder()
                .name("카리나")
                .email("karina@sm.net")
                .gender(Gender.Female)
                          .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .likeColor("Pink")
                .build();
        repository.save(users);
            //입력 후 레코드 수 출력
        System.out.println("데이터 생성 이후" + repository.count());

    }

    @Test
    @DisplayName("전체 레코드 수 출력과 id = 2L인 데이터 존재 확인")
    void userCountAndExitsTest(){
        //전체 레코드 수 출력
        Long count = repository.count();
        System.out.println("전체레코드 수 " + count);

        //2L 이 존재하는지 확인
    boolean exist = repository.existsById(2L);
        System.out.println("2번레코드가 존재 하는지" + exist);
    }

    @Test
    @DisplayName("id= 1L 삭제후 존재 확인하기")
    @Transactional
    void userDeleteAndExitsTest(){
            repository.deleteById(1L);
        boolean exist = repository.existsById(1L);
        System.out.println("1번레코드가 존재 하는지" + exist);

    }

}