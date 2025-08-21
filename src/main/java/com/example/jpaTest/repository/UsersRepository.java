package com.example.jpaTest.repository;

import com.example.jpaTest.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
