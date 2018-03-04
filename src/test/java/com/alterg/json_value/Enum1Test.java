package com.alterg.json_value;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;


public class Enum1Test
{

    @Test
    public void test() throws JsonProcessingException
    {
        final String json = new ObjectMapper().writeValueAsString(Enum1.ARTEM);
        Assert.assertThat(json, containsString("CRAZYMAN"));
        Assert.assertThat(json, not(containsString("ARTEM")));
    }
}