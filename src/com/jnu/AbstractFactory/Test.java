package com.jnu.AbstractFactory;

/**
 * Created by Damon on 2017/8/6.
 * 仅使用由AbstractFactory和AbstractProduct类声明的接口
 */
public class Test {
    public static void main(String[] args){
        //仅使用由AbstractFactory和AbstractProduct类声明的接口
        AnimalFactory blackAnimalFactory = new BlackAnimalFactory();

        Cat blackCat = blackAnimalFactory.createCat();
        blackCat.eat();

        Dog blackDog = blackAnimalFactory.createDog();
        blackDog.eat();

        AnimalFactory whiteAnimalFactory = new WhiteAnimalFactory();

        Cat whiteCat = whiteAnimalFactory.createCat();
        whiteCat.eat();

        Dog whiteDog = whiteAnimalFactory.createDog();
        whiteDog.eat();
    }
}
