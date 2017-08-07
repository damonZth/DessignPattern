package com.jnu.Proxy;


/**
 * Created by Damon on 2017/8/7.
 */
public class ProxyObject implements Object {
    Object object;

    public ProxyObject(){
        System.out.println("这是代理类");
        object = new ObjectImpl();
    }

    @Override
    public void action() {
        System.out.println("代理开始");
        object.action();
        System.out.println("代理结束");
    }
}
