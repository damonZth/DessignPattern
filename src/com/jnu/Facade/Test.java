package com.jnu.Facade;

/**
 * Created by Damon on 2017/8/7.
 */
public class Test {

    public static void main(String[] args){
        ServiceA serviceA = new ServiceAImpl();
        ServiceB serviceB = new ServiceBImpl();

        serviceA.methodA();
        serviceB.methodB();
        System.out.println("+++++++华丽的分割线++++++++++");

        Facade facade = new Facade();
        facade.methodA();
        facade.methodB();
        facade.methodC();
    }

}
