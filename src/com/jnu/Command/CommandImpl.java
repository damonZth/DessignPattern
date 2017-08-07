package com.jnu.Command;

/**
 * Created by Damon on 2017/8/7.
 */
public class CommandImpl extends Command {

    public CommandImpl(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.receive();
    }
}
