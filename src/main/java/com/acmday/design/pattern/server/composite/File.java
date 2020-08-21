package com.acmday.design.pattern.server.composite;

/**
 * @author acmday.
 * @date 2020/8/21.
 */
public class File extends Component {

    private String name;
    private String content;

    public File(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(this.getName());
    }

    @Override
    public String getContent() {
        return content;
    }
}
