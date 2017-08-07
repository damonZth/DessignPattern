package com.jnu.Observer;

/**
 * Created by Damon on 2017/8/7.
 */
public class GZCitizen extends Citizen {

    public GZCitizen(Policeman policeman){
        setPolicemen();
        register(policeman);
    }

    @Override
    void sendMessage(String help) {
        setHelp(help);
        for(int i = 0; i < pols.size(); i++){
            Policeman policeman = (Policeman) pols.get(i);
            policeman.action(this);
        }
    }
}
