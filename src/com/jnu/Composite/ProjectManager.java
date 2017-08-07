package com.jnu.Composite;

import java.util.ArrayList;

/**
 * Created by Damon on 2017/8/7.
 */
public class ProjectManager extends Employer {
    public ProjectManager(String name){
        setName(name);
        employers = new ArrayList();
    }

    @Override
    public void add(Employer employer) {
        employers.add(employer);
    }

    @Override
    public void delete(Employer employer) {
        employers.remove(employer);
    }
}
