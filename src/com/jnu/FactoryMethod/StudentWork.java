package com.jnu.FactoryMethod;

/**
 * Created by Damon on 2017/8/6.
 * ConcreteProduct
 * 实现Product接口
 */
public class StudentWork implements Work {
    @Override
    public void doWork() {
        System.out.println("学生做作业");
    }
}
