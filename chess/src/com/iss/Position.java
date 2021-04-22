package com.iss;

public class Position {
  private final int row;
  private final int col;

  public Position(int row, int col) {
    this.row = row;
    this.col = col;
  }

  public int getCol() {
    return col;
  }

  public int getRow() {
    return row;
  }

  @Override
  public String toString() {
    return "Pos{" + "row=" + row + ", col=" + col + '}';
  }


}
