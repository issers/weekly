package com.iss;

import java.util.ArrayList;
import java.util.List;

public class Queen {
    private final Color color;
    private final Board board;
    private Position position;
    public Queen(Color color, int row, int col, Board b) {
        this.color = color;
        this.position = new Position(row, col);
        this.board = b;
    }

    @Override
    public String toString() {
        return "Queen{" +
                "color=" + color +
                ", position=" + position +
                '}';
    }

    public List<Position> nextMoves() {
        List<Position> nextMoves = new ArrayList<>();
        // Horizontal moves
        for(int col = 0; col < board.getSize(); ++col) {
            if(col == position.getCol()) continue;
            nextMoves.add(new Position(position.getRow(), col));
        }
        // Vertical moves
        for(int row = 0; row < board.getSize(); ++row) {
            if(row == position.getRow()) continue;
            nextMoves.add(new Position(row, position.getCol()));
        }
        //Diagonal moves
        for(int offset = 1-board.getSize(); offset<board.getSize(); ++offset){
            if(offset == 0) continue;
            int row = position.getRow() + offset;
            int col = position.getCol() + offset;
            if(board.isValid(row, col))
                nextMoves.add(new Position(row, col));
            col = position.getCol() - offset;
            if(board.isValid(row, col))
                nextMoves.add(new Position(row, col));
        }
        return nextMoves;
    }
}
