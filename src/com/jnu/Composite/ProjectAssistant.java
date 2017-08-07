package com.jnu.Composite;

/**
 * Created by Damon on 2017/8/7.
 */
public class ProjectAssistant extends Employer {
    public ProjectAssistant(String name){
        setName(name);
        employers = null;//表示没有下属
    }
    @Override
    public void add(Employer employer) {

    }

    @Override
    public void delete(Employer employer) {

    }
}
