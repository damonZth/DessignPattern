package com.jnu.State;



/**
 * Created by Damon on 2017/8/7.
 */
public class Test {
    public static void main(String[] args){
        Content content = new Content();
        content .setWeather(new Rain());
        System.out.println(content.weatherMessage());

        Content content1 = new Content();
        content.setWeather(new Sunshine());
        System.out.println(content.weatherMessage());

    }
}
