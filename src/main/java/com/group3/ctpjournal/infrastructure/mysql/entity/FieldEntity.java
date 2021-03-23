package com.group3.ctpjournal.infrastructure.mysql.entity;

import javax.persistence.*;
import java.util.List;

@Entity()
@Table(name = "champ")
public class FieldEntity {

    private Integer id;
    private String name;
    private String type;
    private CategoryEntity categoryEntity;
    private List<InputEntity> inputEntityList;

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idchamp")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "nomchamp")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "typechamp")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @ManyToOne
    @JoinColumn(name = "idcategorie")
    public CategoryEntity getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }

    @OneToMany
    @JoinColumn(name = "idchamp")
    public List<InputEntity> getInputEntityList() {
        return inputEntityList;
    }

    public void setInputEntityList(List<InputEntity> inputEntityList) {
        this.inputEntityList = inputEntityList;
    }
}
