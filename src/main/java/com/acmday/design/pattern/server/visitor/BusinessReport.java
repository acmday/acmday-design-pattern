package com.acmday.design.pattern.server.visitor;

import com.acmday.design.pattern.server.observer.AbstractStaff;

import java.util.LinkedList;
import java.util.List;

/**
 * @author acmday.
 * @date 2020/7/19.
 */
public class BusinessReport {

    private List<AbstractStaff> abstractStaffs = new LinkedList<>();
    public BusinessReport() {
        abstractStaffs.add(new Manager("经理-A"));
        abstractStaffs.add(new Manager("经理-B"));
        abstractStaffs.add(new Engineer("工程师-A"));
        abstractStaffs.add(new Engineer("工程师-B"));
        abstractStaffs.add(new Engineer("工程师-C"));
        abstractStaffs.add(new Engineer("工程师-D"));
    }

    /**
     * 为访问者展示报表
     * @param visitor 公司高层，如CEO、CTO
     */
    public void showReport(Visitor visitor) {
        abstractStaffs.forEach(elem -> elem.accept(visitor));
    }
}
