package com.alterg.json_raw_value;


import com.fasterxml.jackson.annotation.JsonRawValue;


public class Bean2
{
    private final int code;

    private final String name;


    Bean2(final int code, final String name)
    {
        this.code = code;
        this.name = name;
    }


    @JsonRawValue
    @SuppressWarnings("unused")
    public String getName()
    {
        return name;
    }
}
