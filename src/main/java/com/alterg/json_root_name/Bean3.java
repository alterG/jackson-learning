package com.alterg.json_root_name;


import com.fasterxml.jackson.annotation.JsonRootName;


@JsonRootName("wrapper")
public class Bean3
{
    private final long id;

    private final String name;


    Bean3(final long id, final String name)
    {
        this.id = id;
        this.name = name;
    }


    public long getId()
    {
        return id;
    }


    public String getName()
    {
        return name;
    }
}
