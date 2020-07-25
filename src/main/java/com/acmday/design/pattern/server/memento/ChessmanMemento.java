package com.acmday.design.pattern.server.memento;

/**
 * @author acmday.
 * @date 2020/7/24.
 */
public class ChessmanMemento {

    private String label;
    private int x;
    private int y;

    public ChessmanMemento(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public String getLabel() {
        return label;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
