package com.group3.ctpjournal.services.category;

import com.group3.ctpjournal.services.field.Field;

import java.util.List;

public class Category {
    private Integer id;
    private String name;
    private List<Field> fieldList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Field> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<Field> fieldList) {
        this.fieldList = fieldList;
    }
}
