package com.jnu.Memento;

/**
 * Created by Damon on 2017/8/7.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }
}
