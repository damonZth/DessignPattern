package com.jnu.Memento;

/**
 * Created by Damon on 2017/8/7.
 */
public class Test {
    public static void main(String[] args){
        Originator originator = new Originator();
        originator.setState("开会中");

        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("睡觉中");
        originator.showState();

        originator.setMemento(caretaker.getMemento());
        originator.showState();
    }
}
