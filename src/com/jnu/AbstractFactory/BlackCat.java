package com.jnu.AbstractFactory;

/**
 * Created by Damon on 2017/8/6.
 * 定义一个将被相应的具体工厂创建的产品对象。
 * 实现AbstractProduct接口。
 */
public class BlackCat implements Cat{
    @Override
    public void eat() {
        System.out.println("The black cat is eating!");
    }
}
