package com.jnu.Command;


import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by Damon on 2017/8/7.
 */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver){
        this.receiver = receiver;
    }

    public abstract void execute();
}
