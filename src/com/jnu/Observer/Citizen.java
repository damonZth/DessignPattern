package com.jnu.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Damon on 2017/8/7.
 */
public abstract class Citizen {
    List pols;

    String help = "normal";

    public void setHelp(String help){
        this.help = help;
    }

    public String getHelp(){
        return this.help;
    }

    abstract void sendMessage(String help);

    public void setPolicemen(){
        this.pols = new ArrayList();
    }

    public void register(Policeman policeman){
        this.pols.add(policeman);
    }

    public void unRegister(Policeman policeman){
        this.pols.remove(policeman);
    }
}
