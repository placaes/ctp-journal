package com.group3.ctpjournal.infrastructure.mysql.entity;


import javax.persistence.*;
import java.util.List;

@Entity()
@Table(name = "utilisateur")
public class UserEntity {

    private Integer id;
    private String login;
    private String password;
    private List<CategoryEntity> categoryEntityList;

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idutilisateur")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "loginutilisateur")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "passwordutilisateur")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @OneToMany
    @JoinColumn(name = "idutilisateur")
    public List<CategoryEntity> getCategoryEntityList() {
        return categoryEntityList;
    }

    public void setCategoryEntityList(List<CategoryEntity> categoryEntityList) {
        this.categoryEntityList = categoryEntityList;
    }
}
