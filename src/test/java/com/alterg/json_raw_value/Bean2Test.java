package com.alterg.json_raw_value;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;


public class Bean2Test
{
    private static final String JSON_STRING = "{\"korol\": \"lev\"}";

    private static final String FIELD_NAME = "\"name\":";

    @Test
    public void test() throws JsonProcessingException
    {
        final String json = new ObjectMapper().writeValueAsString(new Bean2(1, JSON_STRING));
        assertThat(json, containsString(FIELD_NAME + JSON_STRING));
    }
}