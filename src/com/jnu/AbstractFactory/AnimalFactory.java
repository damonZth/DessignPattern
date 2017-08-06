package com.jnu.AbstractFactory;

/**
 * Created by Damon on 2017/8/6.
 * 声明一个创建抽象产品对象的操作接口。
 */
public interface AnimalFactory {
    Cat createCat();
    Dog createDog();
}
