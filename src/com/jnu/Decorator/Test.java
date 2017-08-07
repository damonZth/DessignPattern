package com.jnu.Decorator;

/**
 * Created by Damon on 2017/8/7.
 */
public class Test {
    public static void main(String[] args){
        Man man = new Man();
        ManDecoratorA manDecoratorA = new ManDecoratorA();
        ManDecoratorB manDecoratorB = new ManDecoratorB();

        manDecoratorA.setPerson(man);
        //manDecoratorA.eat();
        manDecoratorB.setPerson(manDecoratorA);
        manDecoratorB.eat();
    }
}
