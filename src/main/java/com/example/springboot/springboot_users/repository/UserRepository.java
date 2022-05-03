package com.example.springboot.springboot_users.repository;

import com.example.springboot.springboot_users.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
