package com.jnu.Mediator;

/**
 * Created by Damon on 2017/8/7.
 */
public class Test {
    public static void main(String[] args) {
        Mediator med = new ConcreteMediator();
        //老板来了
        med.notice("boss");

        //客户来了
        med.notice("client");
    }

}
