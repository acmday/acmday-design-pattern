package com.acmday.design.pattern.server.prototype;

/**
 * @author acmday.
 * @date 2020/8/18.
 */
public abstract class AbstractShape implements Cloneable {

    private String id;
    protected String type;

    abstract void draw();

    /**
     *
     * 如果想要深拷贝一个对象， 这个对象必须要实现Cloneable接口，实现clone方法，并且在clone方法内部，
     * 把该对象引用的其他对象也要clone一份 ， 这就要求这个被引用的对象必须也要实现Cloneable接口并且实现clone方法。
     *
     * 如果只是用Object中默认的clone方法，是浅拷贝的，
     * @return
     */
    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }
}
