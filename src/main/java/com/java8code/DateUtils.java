package com.java8code;

import java.sql.Timestamp;
import java.time.*;
import java.util.regex.Pattern;

public class DateUtils {
    private static Pattern DATE_PATTERN_TIMESTAMP = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}.\\d{3}Z$");
    private static Pattern DATE_PATTERN = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
    public static void main(String[] args) {

        String timestampInString = "2023-02-18T20:43:19.161Z";
        String dateInString ="2023-02-18";

        if(DATE_PATTERN_TIMESTAMP.matcher(timestampInString).matches()){
            System.out.println("Its Timestamp");
            Instant instantParse = Instant.parse(timestampInString);
            System.out.println(instantParse);
            System.out.println(LocalDateTime.ofInstant(instantParse,ZoneId.of("UTC")));
        }
        if(DATE_PATTERN.matcher(dateInString).matches()){
            System.out.println("Its a date");
            System.out.println(LocalDate.parse(dateInString));
        }


       // LocalDateTime localDateTime = getLocalDateTime();
       // LocalDate localDate = localDateTime.toLocalDate();
        //System.out.println("Local Date : "+localDate);
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

    public   LocalDateTime getLocalDateTimeCustom() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local Date Time : "+localDateTime );
        return localDateTime;
    }
}
