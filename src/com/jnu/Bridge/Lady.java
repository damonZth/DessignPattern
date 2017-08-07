package com.jnu.Bridge;

/**
 * Created by Damon on 2017/8/7.
 */
public class Lady extends Person {

    public Lady(){
        setType("女人");
    }

    @Override
    public void dress() {
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}
