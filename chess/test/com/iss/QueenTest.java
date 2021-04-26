package com.iss;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QueenTest {
    // TODO:
    //       look at JUNIT4 or JUNIT5
    //       add a test method

    @Test
    void assertNextMoves() {
        Queen q = new Queen(Color.BLACK, 1, 1);
        List<Position> nm = q.nextMoves(3);
        assertArrayEquals(nm.toArray(), q.nextMoves(3).toArray());
    }
}