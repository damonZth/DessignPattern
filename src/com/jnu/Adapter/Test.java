package com.jnu.Adapter;

/**
 * Created by Damon on 2017/8/7.
 */
public class Test {
    public static void main(String[] args){
        Target target = new Adapter(new Adaptee());

        target.adapteeMathod();

        target.adapterMethod();
    }
}
