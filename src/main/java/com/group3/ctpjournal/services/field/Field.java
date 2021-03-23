package com.group3.ctpjournal.services.field;

import com.group3.ctpjournal.services.input.Input;

import java.util.List;

public class Field {
    private Integer id;
    private String name;
    private String type;
    private List<Input> inputList;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Input> getInputList() {
        return inputList;
    }

    public void setInputList(List<Input> inputList) {
        this.inputList = inputList;
    }
}
