package com.acmday.design.pattern.server.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author acmday.
 * @date 2020/8/21.
 */
public class Folder extends Component {

    private String name;

    private List<Component> components = new ArrayList<>();

    public Integer level;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void add(Component component) {
        this.components.add(component);
    }

    @Override
    public void remove(Component component) {
        this.components.remove(component);
    }

    @Override
    public void print() {
        System.out.println(this.getName());
        if (this.level == null) {
            this.level = 1;
        }
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < this.level; i++) {
            prefix.append("\t- ");
        }
        for (Component component : this.components) {
            if (component instanceof Folder){
                ((Folder)component).level = this.level + 1;
            }
            System.out.print(prefix.toString());
            component.print();
        }
        this.level = null;
    }
}
