package com.iss;

public class Main {

    public static void main(String[] args) {
        Queen q = new Queen(Color.BLACK, 0, 1);
        System.out.println(q.nextMoves());
    }
}
