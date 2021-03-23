package com.group3.ctpjournal.infrastructure.mysql.repository;

import com.group3.ctpjournal.infrastructure.mysql.entity.InputEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface InputRepository extends JpaRepository<InputEntity, Integer> {

    @Query(value = "SELECT input FROM InputEntity input WHERE input.date < :dataDebut and input.date > :dateFin ")
    List<InputEntity> findAllWithFilters(@Param("dataDebut") LocalDateTime dataDebut, @Param("dateFin") LocalDateTime dateFin);

}
