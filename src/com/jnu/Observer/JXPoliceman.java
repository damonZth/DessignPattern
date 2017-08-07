package com.jnu.Observer;

/**
 * Created by Damon on 2017/8/7.
 */
public class JXPoliceman implements Policeman {

    @Override
    public void action(Citizen citizen) {
        String help = citizen.getHelp();
        if(help.equals("normal")){
            System.out.println("一切正常，不用行动");
        }
        if(help.equals("unnormal")){
            System.out.println("有情况，江西" +
                    "警察出动");
        }
    }
}
