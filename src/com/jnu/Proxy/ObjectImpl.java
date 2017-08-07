package com.jnu.Proxy;

/**
 * Created by Damon on 2017/8/7.
 */
public class ObjectImpl implements Object {

    @Override
    public void action() {
        System.out.println("++++++++");
        System.out.println("++++++++");
        System.out.println("这是被代理的类");
        System.out.println("++++++++");
        System.out.println("++++++++");
    }
}
