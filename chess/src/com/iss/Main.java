package com.iss;

public class Main {

    public static void main(String[] args) {
        Board b = new Board(3);
        Queen q = new Queen(Color.BLACK, 1, 1, b);
        System.out.println(q.nextMoves());
        System.out.println(q);
    }
}
