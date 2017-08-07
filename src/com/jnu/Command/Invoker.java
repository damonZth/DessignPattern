package com.jnu.Command;

/**
 * Created by Damon on 2017/8/7.
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void execute(){
        command.execute();
    }
}
