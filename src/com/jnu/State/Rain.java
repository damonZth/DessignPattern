package com.jnu.State;

/**
 * Created by Damon on 2017/8/7.
 */
public class Rain implements Weather {
    @Override
    public String getWeather() {
        return "细雨绵绵";
    }
}
