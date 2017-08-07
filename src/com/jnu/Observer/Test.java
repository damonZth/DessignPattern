package com.jnu.Observer;

/**
 * Created by Damon on 2017/8/7.
 */
public class Test {
    public static void main(String[] args){
        Policeman GZpoliceman = new GZPoliceman();
        Policeman JXpoloceman = new JXPoliceman();

        Citizen citizen = new GZCitizen(GZpoliceman);
        citizen.sendMessage("unnormal");
        citizen.sendMessage("normal");

        System.out.println("+++++++++++++++++++++++++++");
        Citizen citizen1 = new JXCitizen(JXpoloceman);
        citizen1.sendMessage("unnormal");
        citizen1.sendMessage("normal");
    }
}
