package com.java8code;

import com.sun.tools.internal.xjc.runtime.ZeroOneBooleanAdapter;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.*;

public class DateUtils {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local Date Time : "+localDateTime );
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println("Local Date : "+localDate);
        Instant instant = Instant.now();
        System.out.println("Instant Value : "+ instant);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zoned Date Time: "+zonedDateTime);

        Timestamp timestamp = Timestamp.from(instant);
        System.out.println("TimeStamp Value : "+timestamp);

        String timeStampInstanceInString = timestamp.toInstant().toString();
        System.out.println("TimeStamp InStance In String: "+timeStampInstanceInString);

        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse(instant.toString());
        System.out.println("Zoned DateTime from Instant: "+ zonedDateTime1);

        ZonedDateTime zonedDateTime2 = ZonedDateTime.parse(timeStampInstanceInString);
        System.out.println("Parsed Zoned Date Time: "+zonedDateTime2);

        long currentTimeInMilliSeconds  = System.currentTimeMillis();
        System.out.println("Current Time in Milli Seconds :"+currentTimeInMilliSeconds);

        ZonedDateTime zonedDateTimeFromLongValue = ZonedDateTime.ofInstant(Instant.ofEpochMilli(currentTimeInMilliSeconds),ZoneId.of("UTC"));
        System.out.println("ZonedDateTime from Long Value: "+zonedDateTimeFromLongValue);
        System.out.println("LocalDate from Long Value: "+zonedDateTimeFromLongValue.toLocalDate());


    }
}
