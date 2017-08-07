package com.jnu.Decorator;

/**
 * Created by Damon on 2017/8/7.
 */
public class ManDecoratorA extends Decorator{
    public void eat(){
        super.eat();
        reEat();
        System.out.println("ManDecoratorA类");
    }

    public void reEat(){
        System.out.println("再吃一顿");
    }
}
