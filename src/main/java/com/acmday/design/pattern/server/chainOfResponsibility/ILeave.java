package com.acmday.design.pattern.server.chainOfResponsibility;

/**
 * @author acmday.
 * @date 2020/7/19.
 */
public interface ILeave {
    /**
     * 获取请假人的姓名
     * @return
     */
    String getName();

    /**
     * 获取请假天数
     * @return
     */
    int getNumber();

    /**
     * 获取请假内容
     * @return
     */
    String getContent();
}
