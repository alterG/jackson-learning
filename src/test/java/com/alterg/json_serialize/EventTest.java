package com.alterg.json_serialize;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;


public class EventTest
{
    @Test
    public void whenUsingJsonSerialize_thenCorrect() throws JsonProcessingException, ParseException
    {
        final SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        final String dateToParse = "10-02-1994 20:30:15";
        final Date expectedDate = formatter.parse(dateToParse);
        final String json = new ObjectMapper().writeValueAsString(new Event("SummerParty", expectedDate));
        assertThat(json, containsString(dateToParse));

    }
}