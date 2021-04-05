package com.iss;

import java.util.ArrayList;
import java.util.List;

public class Queen {
    private final Color color;
    private Position position;
    public Queen(Color color, int row, int col) {
        this.color = color;
        this.position = new Position(row, col);
    }

    public List<Position> nextMoves() {
        List<Position> nextMoves = new ArrayList<>();
        // Horizontal moves
        for(int col = 0; col < 8; ++col) {
            if(col == position.getCol()) continue;
            nextMoves.add(new Position(position.getRow(), col));
        }
        return nextMoves;
    }
}
