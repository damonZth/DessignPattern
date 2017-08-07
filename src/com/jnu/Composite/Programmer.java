package com.jnu.Composite;

/**
 * Created by Damon on 2017/8/7.
 */
public class Programmer extends Employer {

    public Programmer(String name){
        setName(name);
        employers = null;//表示没有下属员工
    }

    @Override
    public void add(Employer employer) {
        //...
    }

    @Override
    public void delete(Employer employer) {
        //...
    }
}
