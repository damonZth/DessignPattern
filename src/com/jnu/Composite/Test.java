package com.jnu.Composite;

import java.util.List;

/**
 * Created by Damon on 2017/8/7.
 */
public class Test {
    public static void main(String[] args){
        Employer projectManager = new ProjectManager("项目经理");
        Employer projectAssistant = new ProjectAssistant("项目助理");
        Employer programmer1 = new Programmer("程序员A");
        Employer programmer2 = new Programmer("程序员B");

        projectManager.add(projectAssistant);
        projectManager.add(programmer1);
        projectManager.add(programmer2);

        List<Employer> employers = projectManager.getEmployers();

        for(Employer employer : employers){
            System.out.println(employer.getName());
        }
    }
}
