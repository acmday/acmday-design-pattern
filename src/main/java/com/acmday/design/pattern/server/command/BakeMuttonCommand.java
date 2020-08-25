package com.acmday.design.pattern.server.command;

/**
 * @author acmday.
 * @date 2020/7/22.
 * ConcreteCommand:将一个接收者对象绑定于一个动作，调用接收者执行相应的操作（也就是该命令）.
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bake(/*receiver.getMessage()*/);
    }
}
