package com.alterg.json_getter;

import com.fasterxml.jackson.annotation.JsonGetter;

public class SimpleBean {
    public int id;
    private String name;

    public SimpleBean(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @JsonGetter("FieldName")
    public String getName() {
        return name;
    }
}
