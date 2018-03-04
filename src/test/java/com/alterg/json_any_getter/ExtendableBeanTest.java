package com.alterg.json_any_getter;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class ExtendableBeanTest
{


    private static final String OBJECT_TYPE_FIELD_NAME = "properties";

    private static final String OBJECT_TYPE_INNER_FILED_NAME = "weigh";

    private static final String OBJECT_TYPE_INNER_FIELD_VALUE = "180";

    private static final String BEAN_PUBLIC_FIELD = "Arkadiy";


    @Test
    public void test() throws JsonProcessingException {
        Map<String, String> map = new HashMap<>();
        map.put(OBJECT_TYPE_INNER_FILED_NAME, OBJECT_TYPE_INNER_FIELD_VALUE);
        ExtendableBean extendableBean = new ExtendableBean(BEAN_PUBLIC_FIELD, map);
        String result = new ObjectMapper().writeValueAsString(extendableBean);
        assertThat(result, containsString(BEAN_PUBLIC_FIELD));
        assertThat(result, containsString(OBJECT_TYPE_INNER_FILED_NAME));
        assertThat(result, containsString(OBJECT_TYPE_INNER_FIELD_VALUE));
        assertThat(result, not(containsString(OBJECT_TYPE_FIELD_NAME)));
    }
}