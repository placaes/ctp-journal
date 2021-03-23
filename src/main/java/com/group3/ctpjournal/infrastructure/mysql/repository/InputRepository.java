package com.group3.ctpjournal.infrastructure.mysql.repository;

import com.group3.ctpjournal.infrastructure.mysql.entity.InputEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InputRepository extends JpaRepository<InputEntity, Integer> {
}
