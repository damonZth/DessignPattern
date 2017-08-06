package com.jnu.Builder;

/**
 * Created by Damon on 2017/8/6.
 */
public class Test {
    public static void main(String[] argv){

        PersonDirector personDirector = new PersonDirector();
        Person person = personDirector.constructPerson(new ManBuilder());
        System.out.println(person.getHead());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());

    }
}
