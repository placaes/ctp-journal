package com.group3.ctpjournal.infrastructure.mysql.repository;

import com.group3.ctpjournal.infrastructure.mysql.entity.FieldEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FieldRepository extends JpaRepository<FieldEntity, Integer> {
}
