package com.laz.svluna;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Device {
    public String model;
    public String manufacturer;
    public String token;
    public String timestamp;

    public Device() {
        // Default constructor required for calls to DataSnapshot.getValue(Device.class).
    }

    public Device(String model, String manufacturer, String token) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.token = token;
        TimeZone tz = TimeZone.getTimeZone("EST");
        DateFormat df = new SimpleDateFormat("yyyyMMdd'T'HHmm");
        df.setTimeZone(tz);
        this.timestamp = df.format(new Date());
    }
}
