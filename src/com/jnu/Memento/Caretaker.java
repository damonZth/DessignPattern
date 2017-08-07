package com.jnu.Memento;

/**
 * Created by Damon on 2017/8/7.
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento(){
        return this.memento;
    }

    public void setMemento(Memento memento){
        this.memento = memento;
    }
}
