package com.jnu.Flyweight;

/**
 * Created by Damon on 2017/8/7.
 */
public class FlyweightImpl implements Flyweight{
    @Override
    public void action(int arg) {
        System.out.println("参数值:" + arg);
    }
}
