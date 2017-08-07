package com.jnu.Facade;

/**
 * Created by Damon on 2017/8/7.
 */
public class Facade {
    private ServiceA serviceA;
    private ServiceB serviceB;
    private ServiceC serviceC;

    public Facade(){
        serviceA = new ServiceAImpl();
        serviceB = new ServiceBImpl();
        serviceC = new ServiceCImpl();
    }

    public void methodA(){
        serviceA.methodA();
        serviceB.methodB();
        System.out.println("+++++++facade.methodA++++++++++");
    }

    public void methodB(){
        serviceB.methodB();
        serviceC.methodC();
        System.out.println("+++++++facade.methodB++++++++++");
    }

    public void methodC(){
        serviceC.methodC();
        serviceA.methodA();
        System.out.println("+++++++facade.methodC++++++++++");
    }
}
