package com.acmday.design.pattern.server.memento;

import java.util.ArrayList;

/**
 * @author acmday.
 * @date 2020/7/24.
 */
public class MementoCaretaker {

    private ArrayList mementolist = new ArrayList();

    public ChessmanMemento getMemento(int i) {
        return (ChessmanMemento) mementolist.get(i);
    }

    public void addMemento(ChessmanMemento memento) {
        mementolist.add(memento);
    }
}
