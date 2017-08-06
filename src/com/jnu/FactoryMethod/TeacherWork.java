package com.jnu.FactoryMethod;

/**
 * Created by Damon on 2017/8/6.
 *  ConcreteProduct
 * 实现Product接口
 */
public class TeacherWork implements Work {
    @Override
    public void doWork() {
        System.out.println("老师批改作业");
    }
}
