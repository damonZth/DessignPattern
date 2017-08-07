package com.jnu.Bridge;

/**
 * Created by Damon on 2017/8/7.
 */
public class Man extends Person{

    public Man(){
        setType("男人");
    }

    @Override
    public void dress() {
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}
