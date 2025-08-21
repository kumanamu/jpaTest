package com.example.jpaTest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.java.Log;

//테스트코드 작업  컨트롤+쉬프트+t


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//baseEntity의 tostring을 호출
@ToString(callSuper = true)
public class UserTest extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
}
