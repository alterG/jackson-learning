package com.alterg.json_property_order;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonPropertyOrder({"name", "id"})
public class Bean1
{
    public int code;

    public int id;

    public String name;

    public Bean1(int code, int id, String name) {
        this.code = code;
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) throws JsonProcessingException {
        String json = new ObjectMapper().writeValueAsString(new Bean1(3, 1, "Sveta"));
        System.out.println(json);
    }
}
