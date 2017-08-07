package com.jnu.Singleton;

/**
 * Created by Damon on 2017/8/7.
 */
public class Singleton2 {
    public static Singleton2 singleton2 = null;

    private Singleton2(){
        //...
    }

    /**
     * 将synchronized关键字加在了内部，也就是说当调用的时候是不需要加锁的，只有在instance为null，并创建对象的时候才需要加锁，性能有一定的提升
     *
     * @return
     */
    public static Singleton2 getInstance(){
        if(singleton2 == null){
            synchronized (singleton2){
                if(singleton2 == null){
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }


    public Object readResolve(){
        return singleton2;
    }
}
