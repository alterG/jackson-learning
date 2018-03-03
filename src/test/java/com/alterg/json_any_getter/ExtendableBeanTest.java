package com.alterg.json_any_getter;

import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.StringContains.containsString;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ExtendableBeanTest
{
    @Test
    public void test() throws JsonProcessingException {
        Map<String, String> map = new HashMap<>();
        map.put("weigh", "180cm");
        ExtendableBean extendableBean = new ExtendableBean("Arkadiy", map);
        String result = new ObjectMapper().writeValueAsString(extendableBean);
        Assert.assertThat(result, containsString("Arkadiy"));
        Assert.assertThat(result, containsString("weigh")); 
        Assert.assertThat(result, containsString("180"));
        Assert.assertThat(result, not(containsString("properties")));
    }
}