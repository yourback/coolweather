package com.coolweather.android.gson;

import java.util.List;

/**
 * Created by PC on 2017/10/9.
 */

public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    public List<Forecast> forecastList;
}
