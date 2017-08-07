package com.jnu.Observer;

/**
 * Created by Damon on 2017/8/7.
 */
public class JXCitizen extends Citizen {

    public JXCitizen(Policeman policeman){
        setPolicemen();
        register(policeman);
    }

    @Override
    void sendMessage(String help) {
        setHelp(help);
        for(int i = 0; i < pols.size(); i ++){
            Policeman policeman = (Policeman) pols.get(i);
            policeman.action(this);
        }
    }
}
