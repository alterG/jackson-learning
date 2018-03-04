package com.alterg.json_root_name;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.Test;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;


public class Bean3Test
{
    private static final String WRAPPER = "wrapper";


    @Test
    public void test() throws JsonProcessingException
    {
        final String json = new ObjectMapper().enable(SerializationFeature.WRAP_ROOT_VALUE)
                .writeValueAsString(new Bean3(1,"Sanya"));
        assertThat(json, containsString(WRAPPER));
    }
}