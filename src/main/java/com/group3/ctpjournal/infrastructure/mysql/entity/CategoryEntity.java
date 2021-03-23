package com.group3.ctpjournal.infrastructure.mysql.entity;

import com.group3.ctpjournal.services.user.User;

import javax.persistence.*;
import java.util.List;

@Entity()
@Table(name = "categorie")
public class CategoryEntity {
    private Integer id;
    private String name;
    private UserEntity userEntity;
    private List<FieldEntity> fieldEntityList;

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcategorie")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "nomcategorie")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    @JoinColumn(name = "idutilisateur")
    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    @OneToMany
    @JoinColumn(name = "idcategorie")
    public List<FieldEntity> getFieldEntityList() {
        return fieldEntityList;
    }

    public void setFieldEntityList(List<FieldEntity> fieldEntityList) {
        this.fieldEntityList = fieldEntityList;
    }

}
