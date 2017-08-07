package com.jnu.Strategy;

/**
 * Created by Damon on 2017/8/7.
 */
public class Context {
    Strategy strategy;

    public Context (Strategy strategy){
        this.strategy = strategy;
    }

    public void doMethod(){
        strategy.method();
    }
}
