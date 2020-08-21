package com.acmday.design.pattern.server.memento;

/**
 * @author wushaofeng.
 * @date 2020/8/21.
 */
public class Client {

    private static int index = -1;
    private static MementoCaretaker mc = new MementoCaretaker();

    public static void play() {
        ChessmanOriginator chess = new ChessmanOriginator("车", 1, 1);
        play(chess);
        chess.setY(4);
        play(chess);
        chess.setX(5);
        play(chess);
        undo(chess, index);
        undo(chess, index);
        redo(chess, index);
        redo(chess, index);
    }

    public static void play(ChessmanOriginator chess) {
        mc.addMemento(chess.save());
        index++;
        chess.show();
    }

    public static void undo(ChessmanOriginator chess, int i) {
        System.out.println("******悔棋******");
        index--;
        chess.restore(mc.getMemento(i - 1));
        chess.show();
    }

    public static void redo(ChessmanOriginator chess, int i) {
        System.out.println("******撤销悔棋******");
        index++;
        chess.restore(mc.getMemento(i + 1));
        chess.show();
    }
}
