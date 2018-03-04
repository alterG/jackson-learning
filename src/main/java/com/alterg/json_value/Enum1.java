package com.alterg.json_value;


import com.fasterxml.jackson.annotation.JsonValue;


public enum Enum1
{
    ARTEM(1, "CRAZYMAN"),
    YAROSLAV(2, "YAR");

    private int code;

    private String name;


    Enum1(final int code, final String name)
    {
        this.code = code;
        this.name = name;
    }

    public int getCode()
    {
        return code;
    }

    @JsonValue
    public String getName()
    {
        return name;
    }
}
