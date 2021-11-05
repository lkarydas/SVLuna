package com.laz.svluna;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTimeManager {

    static public String now() {
        TimeZone tz = TimeZone.getTimeZone("EST");
        DateFormat df = new SimpleDateFormat("yyyyMMdd'T'HHmmss");
        df.setTimeZone(tz);
        return df.format(new Date());
    }
}
