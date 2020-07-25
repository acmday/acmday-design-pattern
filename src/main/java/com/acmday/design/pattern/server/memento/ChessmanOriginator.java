package com.acmday.design.pattern.server.memento;

/**
 * @author acmday.
 * @date 2020/7/24.
 */
public class ChessmanOriginator {
    private String label;
    private int x;
    private int y;

    public ChessmanOriginator(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public ChessmanMemento save() {
        return new ChessmanMemento(this.label, this.x, this.y);
    }

    public void restore(ChessmanMemento memento) {
        this.label = memento.getLabel();
        this.x = memento.getX();
        this.y = memento.getY();
    }

    public void show() {
        System.out.println(String.format("棋子<%s>：当前位置为：<%d, %d>", this.getLabel(), this.getX(), this.getY()));
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

    public void setLabel(String label) {
        this.label = label;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
