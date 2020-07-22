package com.acmday.design.pattern.server.command;

/**
 * @author acmday.
 * @date 2020/7/22.
 */
public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bake(receiver.getMessage());
    }
}
