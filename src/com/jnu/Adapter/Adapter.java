package com.jnu.Adapter;

/**
 * Created by Damon on 2017/8/7.
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter (Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void adapteeMathod() {
        adaptee.adapteeMethod();
    }

    @Override
    public void adapterMethod() {
        System.out.println("Adapter method!");
    }
}
