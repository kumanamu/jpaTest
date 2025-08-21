package com.example.jpaTest.entity;


import com.example.jpaTest.dto.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String name;
    @Column(length = 50)
    private String email;

    //Enum Type은 생성시 순번이 기본
    //Enum Tpye 자체의 문자열로 저장

     @Column(length = 10)
     @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name= "like_color")
    private String likeColor;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
