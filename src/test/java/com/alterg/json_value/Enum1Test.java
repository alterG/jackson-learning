package com.alterg.json_value;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;


public class Enum1Test
{
    private static final String ENUM_NAME_FIELD = "\"ARTEMIUS\"";

    private static final String ENAM_NAME = "\"ARTEM\"";


    @Test
    public void test() throws JsonProcessingException
    {
        final String json = new ObjectMapper().writeValueAsString(Enum1.ARTEM);
        Assert.assertThat(json, is(ENUM_NAME_FIELD));
        Assert.assertThat(json, not(is(ENAM_NAME)));
    }
}