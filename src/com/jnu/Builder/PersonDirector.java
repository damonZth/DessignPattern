package com.jnu.Builder;

/**
 * Created by Damon on 2017/8/6.
 */
public class PersonDirector {
    public Person constructPerson(PersonBuilder personBuilder){
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildFoot();
        return personBuilder.buildPerson();
    }
}
