package com.acmday.design.pattern.server.mediator;

/**
 * @author acmday.
 * @date 2020/7/22.
 */
public class LiSi extends AbstractPeople {

    public LiSi(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        System.out.println("LiSi发送消息：" + message);
        mediator.send(message, this);
    }

    @Override
    public void response(String messsage) {
        System.out.println("LiSi回复消息：" + messsage);
        mediator.response(messsage, this);
    }

    public void gotIt(String message){
        System.out.println("LiSi got it! message=" + message);
    }
}
