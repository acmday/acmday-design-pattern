package com.acmday.design.pattern.server.chainOfResponsibility;

import com.acmday.design.pattern.server.chainOfResponsibility.ILeave;
import com.acmday.design.pattern.server.chainOfResponsibility.AbstractHandler;

/**
 * @author acmday.
 * @date 2020/7/19.
 * 总经理
 */
public class BigManager extends AbstractHandler {

    public BigManager () {
        super(AbstractHandler.NUM_SEVEN);
    }

    @Override
    public void handleLeave(ILeave leave) {
        System.out.println(leave.getName() + "请假" + leave.getNumber() + "天, 请假原因：" + leave.getContent() + "。");
        System.out.println("总经理审批：同意。");
    }
}
