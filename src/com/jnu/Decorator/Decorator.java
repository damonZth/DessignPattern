package com.jnu.Decorator;

/**
 * Created by Damon on 2017/8/7.
 */
public abstract class Decorator implements Person {
    protected Person person;

    public void setPerson(Person person){
        this.person = person;
    }

    public void eat(){
        person.eat();
    }
}
