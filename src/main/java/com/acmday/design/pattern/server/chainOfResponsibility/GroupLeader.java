package com.acmday.design.pattern.server.chainOfResponsibility;

import com.acmday.design.pattern.server.chainOfResponsibility.ILeave;
import com.acmday.design.pattern.server.chainOfResponsibility.AbstractHandler;

/**
 * @author acmday.
 * @date 2020/7/19.
 */
public class GroupLeader extends AbstractHandler {

    public GroupLeader() {
        super(AbstractHandler.NUM_ONE, AbstractHandler.NUM_THREE);
    }

    @Override
    public void handleLeave(ILeave leave) {
        System.out.println(leave.getName() + "请假" + leave.getNumber() + "天，请假原因：" + leave.getContent() + "。");
        System.out.println("小组长审批：同意。");
    }
}
