package com.acmday.design.pattern.server.visitor;

/**
 * @author acmday.
 * @date 2020/7/19.
 */
public interface Visitor {
    /**
     * 访问工程师类型
     * @param engineer
     */
    void visit(Engineer engineer);

    /**
     * 访问经理类型
     * @param manager
     */
    void visit(Manager manager);
}
