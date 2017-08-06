package com.jnu.Prototype;

/**
 * Created by Damon on 2017/8/6.
 */
public class Test {
    public static void main(String[] argv){
        Prototype prototype = new ConcretePrototype("prototype");
        Prototype prototype1 = (Prototype) prototype.clone();
        System.out.println(prototype.getName());
        System.out.println(prototype1.getName());
        System.out.println(prototype);
        System.out.println(prototype1);
    }
}
