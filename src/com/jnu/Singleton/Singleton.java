package com.jnu.Singleton;

/**
 * Created by Damon on 2017/8/6.
 */
public class Singleton {
    //持有静态实例，防止被引用，此处赋值为null，目的是实现延迟功能。
    private static Singleton singleton = null;

    /**
     * 私有构造器，防止被实例化
     */
    private Singleton(){
        //
    }

    /**
     * 静态工程方法，创建实例
     * @return
     */
    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    /**
     * 如果该对象被用于序列化，可以保证对象在序列化前后一致
     * @return
     */
    public Object readResolve(){
        return singleton;
    }
}
