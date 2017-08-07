package com.jnu.Bridge;

/**
 * Created by Damon on 2017/8/7.
 */
public class Jacket extends Clothing {
    @Override
    public void personDressCloth(Person person) {
        System.out.println(person.getType() + "穿马甲");
    }
}
