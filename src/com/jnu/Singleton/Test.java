package com.jnu.Singleton;

/**
 * Created by Damon on 2017/8/6.
 */
public class Test {
    public static void main(String[] argv){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        //同一个对象
        System.out.println(singleton1);//com.jnu.Singleton.Singleton@1540e19d
        System.out.println(singleton2);//com.jnu.Singleton.Singleton@1540e19d
    }
}
