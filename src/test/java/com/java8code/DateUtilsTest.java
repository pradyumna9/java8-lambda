package com.java8code;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDateTime;

import static org.mockito.ArgumentMatchers.any;

@RunWith(MockitoJUnitRunner.class)
public class DateUtilsTest {
    @InjectMocks
    private DateUtils unit;

    @Test
    public void getLocalDate(){
        try(MockedStatic<LocalDateTime> localDateTimeMockedStatic = Mockito.mockStatic(LocalDateTime.class)){
            localDateTimeMockedStatic.when(LocalDateTime::now).thenReturn("");
        }

        LocalDateTime localDateTime = unit.getLocalDateTimeCustom();
        Assert.assertEquals( LocalDateTime.of(2023,1,22,10,32,33,33),localDateTime);
    }
}