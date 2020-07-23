package com.acmday.design.pattern.server.mediator;

/**
 * @author acmday.
 * @date 2020/7/22.
 */
public class ZhangSan extends AbstractPeople {

    public ZhangSan(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("ZhangSan发送消息：" + message);
        mediator.send(message, this);
    }

    @Override
    public void response(String messsage) {
        System.out.println("ZhangSan回复消息：" + messsage);
        mediator.response(messsage, this);
    }

    public void gotIt(String message){
        System.out.println("ZhangSan got it! message=" + message);
    }
}
