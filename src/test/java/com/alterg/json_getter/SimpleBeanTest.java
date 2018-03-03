package com.alterg.json_getter;

import static org.hamcrest.Matchers.containsString;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

public class SimpleBeanTest {

    @Test
    public void test() throws JsonProcessingException {
        SimpleBean bean = new SimpleBean(1, "Ivan");
        String json = new ObjectMapper().writeValueAsString(bean);
        Assert.assertThat(json, containsString("FieldName"));
        Assert.assertThat(json, containsString("Ivan"));
    }
}