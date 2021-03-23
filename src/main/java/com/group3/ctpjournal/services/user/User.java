package com.group3.ctpjournal.services.user;

import com.group3.ctpjournal.infrastructure.mysql.entity.CategoryEntity;
import com.group3.ctpjournal.services.category.Category;

import java.util.List;

public class User {

    private Integer id;
    private String login;
    private String password;
    private List<Category> categoryList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }
}
