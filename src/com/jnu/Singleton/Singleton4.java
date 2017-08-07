package com.jnu.Singleton;

/**
 * Created by Damon on 2017/8/7.
 */
public class Singleton4 {
    public static Singleton4 singleton4 = null;

    private Singleton4(){
        //...
    }

    private static synchronized void syncInit(){
        if(singleton4 == null){
            singleton4 = new Singleton4();
        }
    }

    /**
     * 将创建和getInstance()分开，单独为创建加synchronized关键字
     * @return
     */
    public static Singleton4 getInstance(){
        if(singleton4 == null){
            syncInit();
        }
        return singleton4;
    }

    public Object readResolve(){
        return singleton4;
    }
}
