package com.example.jpaTest.repository;

import com.example.jpaTest.entity.UserTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTestRepository extends JpaRepository<UserTest, Long> {
}
