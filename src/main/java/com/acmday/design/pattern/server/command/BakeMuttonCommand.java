package com.acmday.design.pattern.server.command;

/**
 * @author acmday.
 * @date 2020/7/22.
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bake(receiver.getMessage());
    }
}
