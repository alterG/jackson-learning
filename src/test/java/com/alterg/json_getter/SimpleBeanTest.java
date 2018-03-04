package com.alterg.json_getter;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.containsString;


public class SimpleBeanTest
{
    private static final String KEY_FIELD_ANNOTATION_PARAM = "FieldName";

    private static final String VALUE_OF_JACKSON_OPEN_FIELD = "Ivan";


    @Test
    public void test() throws JsonProcessingException
    {
        SimpleBean bean = new SimpleBean(1, "Ivan");
        String json = new ObjectMapper().writeValueAsString(bean);
        Assert.assertThat(json, containsString(KEY_FIELD_ANNOTATION_PARAM));
        Assert.assertThat(json, containsString(VALUE_OF_JACKSON_OPEN_FIELD));
    }
}