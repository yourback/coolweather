package com.coolweather.android.gson;

/**
 * Created by PC on 2017/10/9.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;

        @Override
        public String toString() {
            return "AQICity{" +
                    "aqi='" + aqi + '\'' +
                    ", pm25='" + pm25 + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "AQI{" +
                "city=" + city +
                '}';
    }
}
