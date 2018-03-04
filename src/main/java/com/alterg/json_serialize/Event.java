package com.alterg.json_serialize;


import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;


public class Event
{
    public String name;

    @JsonSerialize(using = CustomDateSerializer.class)
    public Date date;


    public Event(final String name, final Date date)
    {

        this.name = name;
        this.date = date;
    }
}
