package com.jnu.Builder;

/**
 * Created by Damon on 2017/8/6.
 */
public interface PersonBuilder {
    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();
}
