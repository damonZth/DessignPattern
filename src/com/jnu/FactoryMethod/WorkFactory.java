package com.jnu.FactoryMethod;

/**
 * Created by Damon on 2017/8/6.
 * Creator
 * 声明工厂方法，该方法返回一个Product类型的对象
 * Creator也可以定义一个工厂方法的缺省实现，它返回一个缺省的ConcreteProduct对象
 * 可以调用工厂方法来创建一个Product对象
 */
public interface WorkFactory {
    Work getWork();
}
