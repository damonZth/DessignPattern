package com.jnu.Singleton;

/**
 * Created by Damon on 2017/8/6.
 */
public class Singleton {
    private static Singleton singleton;
    private Singleton(){
        //
    }

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
