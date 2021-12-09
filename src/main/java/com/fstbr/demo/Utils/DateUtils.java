package com.fstbr.demo.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class DateUtils {

    /****
     * 时区转换
     * @apiNote UTC时间转化为服务器所在时区所在时间
     * ****/
    public static Date UTCToCNDate(String utc, String formatPattern) {
        ZonedDateTime zdt  = ZonedDateTime.parse(utc);
        LocalDateTime localDateTime = zdt.toLocalDateTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatPattern);
        return utcToLocal(formatter.format(localDateTime));
    }

    public static Date utcToLocal(String utcTime){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date utcDate = null;
        try {
            utcDate = sdf.parse(utcTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        sdf.setTimeZone(TimeZone.getDefault());
        Date localDate = null;
        String localTime = sdf.format(utcDate.getTime());
        try {
            localDate = sdf.parse(localTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return localDate;
    }
}
