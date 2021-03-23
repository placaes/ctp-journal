package com.group3.ctpjournal.infrastructure.mysql.repository;

import com.group3.ctpjournal.infrastructure.mysql.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
