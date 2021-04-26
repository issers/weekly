package com.iss;

public class Main {

    public static void main(String[] args) {

        Queen q = new Queen(Color.BLACK, 1, 1);
        System.out.println(q.nextMoves(3));

    }
}
