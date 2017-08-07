package com.jnu.Composite;

import java.util.List;

/**
 * Created by Damon on 2017/8/7.
 */
public abstract class Employer {
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public abstract void add(Employer employer);

    public abstract void delete(Employer employer);

    public List employers;

    public void printInfo(){
        System.out.println(name);
    }
    public List<Employer> getEmployers(){
        return this.employers;
    }
}
