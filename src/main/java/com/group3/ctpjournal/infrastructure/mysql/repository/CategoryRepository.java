package com.group3.ctpjournal.infrastructure.mysql.repository;

import com.group3.ctpjournal.infrastructure.mysql.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
}
