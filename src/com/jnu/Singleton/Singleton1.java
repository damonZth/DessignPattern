package com.jnu.Singleton;

/**
 * Created by Damon on 2017/8/7.
 */
public class Singleton1 {
    public static Singleton1 singleton1 = null;

    private Singleton1(){
        //...
    }

    /**
     * 如果我们把它放入多线程的环境下，肯定就会出现问题了，如何解决？我们首先会想到对getInstance方法加synchronized关键字
     * 这样的用法，在性能上会有所下降，因为每次调用getInstance()，都要对对象上锁，事实上，只有在第一次创建对象的时候需要加锁，之后就不需要了
     * @return
     */
    public static synchronized Singleton1 getInstance(){
        if(singleton1 == null){
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

    public Object readResolve(){
        return singleton1;
    }
}
