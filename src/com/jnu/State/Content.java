package com.jnu.State;

import java.nio.file.Watchable;

/**
 * Created by Damon on 2017/8/7.
 */
public class Content {
    private Weather weather;

    public void setWeather(Weather weather){
        this.weather = weather;
    }
    public Weather getWeather(){
        return this.weather;
    }

    public String weatherMessage(){
        return weather.getWeather();
    }
}
