package com.acmday.design.pattern.server.mediator;

/**
 * @author acmday.
 * @date 2020/7/22.
 */
public class ConcreteMediator implements Mediator{

    private ZhangSan zhangSan;
    private LiSi liSi;

    public void setZhangSan(ZhangSan zhangSan) {
        this.zhangSan = zhangSan;
    }

    public void setLiSi(LiSi liSi) {
        this.liSi = liSi;
    }


    @Override
    public void send(String message, AbstractPeople sender) {
        if(sender.getClass().getSimpleName().equals(zhangSan.getClass().getSimpleName())) {
            liSi.gotIt(message);
        }
        if(sender.getClass().getSimpleName().equals(liSi.getClass().getSimpleName())) {
            zhangSan.gotIt(message);
        }
    }

    @Override
    public void response(String message, AbstractPeople responser) {
        if(responser.getClass().getSimpleName().equals(zhangSan.getClass().getSimpleName())) {
            liSi.gotIt(message);
        }
        if(responser.getClass().getSimpleName().equals(liSi.getClass().getSimpleName())) {
            zhangSan.gotIt(message);
        }
    }
}
