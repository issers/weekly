package com.iss;

public class Board {

    private final int size;

    public int getSize() {
        return size;
    }

    public Board(int size) {
        this.size = size;
    }

    public boolean isValid(int row, int col) {
        return row >= 0 && col >= 0 && row < size && col < size;
    }
}
