package com.alterg.json_any_getter;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.Map;

public class ExtendableBean
{
    public String name;

    private Map<String, String> properties;

    public ExtendableBean(String name, Map<String, String> properties) {
        this.name = name;
        this.properties = properties;
    }

    @JsonAnyGetter
    public Map<String,String> getProperties()
    {
        return properties;
    }
}