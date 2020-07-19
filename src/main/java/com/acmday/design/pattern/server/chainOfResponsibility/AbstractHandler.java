package com.acmday.design.pattern.server.chainOfResponsibility;

/**
 * @author acmday.
 * @date 2020/7/19.
 */
public abstract class AbstractHandler {

    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    /**
     * 该handler处理的请假天数区间
     */
    private int numStart = 0;
    private int numEnd = 0;

    private AbstractHandler nextHandler;

    /**
     * 设置请假天数范围 上不封顶
     * @param numStart
     */
    public AbstractHandler(int numStart) {
        this.numStart = numStart;
    }

    /**
     * 设置请假天数范围
     * @param numStart
     * @param numEnd
     */
    public AbstractHandler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(AbstractHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    /**
     * 提交请假条
     */
    public final void submit(ILeave leave){
        if(0 == this.numStart){
            return;
        }
        if(leave.getNumber() >= this.numStart){
            this.handleLeave(leave);
            if(null != this.nextHandler && leave.getNumber() > numEnd){
                this.nextHandler.submit(leave);
            }
        }
    }

    /**
     * 各级领导处理请假条方法
     * @param leave
     */
    protected abstract void handleLeave(ILeave leave);
}
