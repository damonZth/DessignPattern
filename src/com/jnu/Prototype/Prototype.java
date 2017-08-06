package com.jnu.Prototype;

/**
 * Created by Damon on 2017/8/6.
 */
public class Prototype implements Cloneable {
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public Object clone(){
        try{
            return super.clone();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
