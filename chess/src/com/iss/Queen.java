package com.iss;

import java.util.ArrayList;
import java.util.List;
//TODO
// configurable board (n x n)
// implement nextmoves() correctly
// use our (Erik's) github workflow

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
    for (int col = 0; col < board.getSize(); ++col) {
            if(col == position.getCol()) continue;
            nextMoves.add(new Position(position.getRow(), col));
        }

    // Vertical moves
    for (int row = 0; row < board.getSize(); ++row) {
            if(row == position.getRow()) continue;
            nextMoves.add(new Position(row, position.getCol()));
        }

    // Diagonal moves
    for (int diag = 1; diag < board.getSize(); ++diag) {
            addDiagonalMove(-1 * diag, -1 * diag,nextMoves);
            addDiagonalMove(-1 * diag, diag,nextMoves);
            addDiagonalMove(diag, -1 * diag,nextMoves);
            addDiagonalMove(diag, diag,nextMoves);
        }


        return nextMoves;
    }

    private void addDiagonalMove(int rowDelta, int colDelta, List<Position> nextMoves) {
        if(position.getRow() + rowDelta >= 0 && position.getCol() + colDelta >= 0)
            nextMoves.add(new Position(position.getRow() + rowDelta, position.getCol() + colDelta));
    }

}
