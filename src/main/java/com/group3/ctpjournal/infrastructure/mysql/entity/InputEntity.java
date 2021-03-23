package com.group3.ctpjournal.infrastructure.mysql.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity()
@Table(name = "saisie")
public class InputEntity {
    private Integer id;
    private LocalDateTime date;
    private String value;
    private FieldEntity fieldEntity;

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsaisie")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "datesaisie")
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Column(name = "valeursaisie")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @ManyToOne
    @JoinColumn(name = "idchamp")
    public FieldEntity getFieldEntity() {
        return fieldEntity;
    }

    public void setFieldEntity(FieldEntity fieldEntity) {
        this.fieldEntity = fieldEntity;
    }
}
