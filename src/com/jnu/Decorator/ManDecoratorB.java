package com.jnu.Decorator;

/**
 * Created by Damon on 2017/8/7.
 */
public class ManDecoratorB extends Decorator {
    public void eat(){
        super.eat();
        System.out.println("+++++++++");
        System.out.println("ManDecoratorB类");
    }
}
