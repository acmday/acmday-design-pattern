package com.acmday.design.pattern.server.builder;

/**
 * @author acmday.
 * @date 2020/8/18.
 * User的实现，完全参考了lombok中@Builder反编译后的代码。
 */
public class User {

    private int id;
    private String name;
    private String addr;
    private int age;

    private User(int id, String name, String addr, int age) {
        this.id = id;
        this.name = name;
        this.addr = addr;
        this.age = age;
    }

    public static User.UserBuilder builder() {
        return new User.UserBuilder();
    }

    public static class UserBuilder {
        private int id;
        private String name;
        private String addr;
        private int age;

        UserBuilder() {
        }

        public User.UserBuilder id(final int id) {
            this.id = id;
            return this;
        }

        public User.UserBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public User.UserBuilder addr(final String addr) {
            this.addr = addr;
            return this;
        }

        public User.UserBuilder age(final int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this.id, this.name, this.addr, this.age);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", age=" + age +
                '}';
    }
}
