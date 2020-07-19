package com.acmday.design.pattern.server.service.impl;

import com.acmday.design.pattern.server.service.Visitor;

/**
 * @author acmday.
 * @date 2020/7/19.
 */
public class CeoVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师: " + engineer.name + ", KPI: " + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理: " + manager.name + ", KPI: " + manager.kpi +
                ", 新产品数量: " + manager.getProducts());
    }
}
