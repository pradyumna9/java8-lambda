package com.java8code;


import org.junit.Assert;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;

public class StaticUtilsTest {
    @Test
    public void givenStaticMethodWithNoArgs_whenMocked_thenReturnsMockSuccessfully() {
        Assert.assertEquals("Baeldung",StaticUtils.name());

        try (MockedStatic<StaticUtils> utilities = Mockito.mockStatic(StaticUtils.class)) {
            utilities.when(StaticUtils::name).thenReturn("Eugen");
            Assert.assertEquals("Eugen",StaticUtils.name());
        }
        Assert.assertEquals("Baeldung",StaticUtils.name());

    }

    @Test
    public void testGetString(){
        Map map = new HashMap<>();
        map.put("pk","pradyumna");
        map.put("is","itishree");

        try(MockedStatic<StaticUtils> utilsMockedStatic = mockStatic(StaticUtils.class)){
            utilsMockedStatic.when(()->StaticUtils.getString(any(),any())).thenReturn("dipu");
        }

        String value = StaticUtils.getString(null,null);
        Assert.assertEquals("",value);
    }



}