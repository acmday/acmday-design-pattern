package com.acmday.design.pattern.server.builder;

import java.util.Date;

/**
 * @author acmday.
 * @date 2020/8/18.
 */
public class Person {

    /** required **/
    private final String name;
    private final String gender;
    private final Date date;
    private final String email;

    /** optional **/
    private final int height;
    private final String edu;
    private final String nickName;
    private final int weight;
    private final String addr;

    /**
     * 私有构造器，Person对象的创建必须依赖于Builder.
     */
    private Person(Builder builder) {
        this.name = builder.name;
        this.gender = builder.gender;
        this.date = builder.date;
        this.email = builder.email;
        this.height = builder.height;
        this.edu = builder.edu;
        this.nickName = builder.nickName;
        this.weight = builder.weight;
        this.addr = builder.addr;
    }

    public static class Builder{
        /** required，使用final修饰 **/
        private final String name;
        private final String gender;
        private final Date date;
        private final String email;

        /** optional，不使用final修饰 **/
        private int height;
        private String edu;
        private String nickName;
        private int weight;
        private String addr;

        public Builder(String name, String gender, Date date, String email) {
            this.name = name;
            this.gender = gender;
            this.date = date;
            this.email = email;
        }

        /**
         * 返回Builder对象本身，链式调用
         * @param height
         * @return
         */
        public Builder height(int height){
            this.height = height;
            return this;
        }

        public Builder edu(String edu){
            this.edu = edu;
            return this;
        }

        public Builder nickName(String nickName){
            this.nickName = nickName;
            return this;
        }

        public Builder weight(int weight){
            this.weight = weight;
            return this;
        }

        public Builder addr(String addr){
            this.addr = addr;
            return this;
        }

        /**
         * 通过Builder构建所需Person对象，并且每次都产生新的Person对象
         * @return
         */
        public Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", date=" + date +
                ", email='" + email + '\'' +
                ", height=" + height +
                ", edu='" + edu + '\'' +
                ", nickName='" + nickName + '\'' +
                ", weight=" + weight +
                ", addr='" + addr + '\'' +
                '}';
    }
}
