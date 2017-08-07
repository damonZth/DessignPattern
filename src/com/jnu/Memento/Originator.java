package com.jnu.Memento;

/**
 * Created by Damon on 2017/8/7.
 */
public class Originator {
    private String state;

    public String getState(){
        return this.state;
    }
    public void setState(String state){
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(state);
    }

    public void setMemento(Memento memento){
        state = memento.getState();
    }

    public void showState(){
        System.out.println(state);
    }
}
