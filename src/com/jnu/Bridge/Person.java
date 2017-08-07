package com.jnu.Bridge;

/**
 * Created by Damon on 2017/8/7.
 */
public abstract class Person {
    private Clothing clothing;

    private String type;

    public Clothing getClothing(){
        return this.clothing;
    }
    public void setClothing(Clothing clothing){
        this.clothing = clothing;
    }

    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }

    public abstract void dress();
}
