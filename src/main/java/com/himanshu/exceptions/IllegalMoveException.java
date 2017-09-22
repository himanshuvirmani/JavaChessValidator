package com.himanshu.exceptions;

import com.himanshu.model.ChessBoardCoord;
import com.himanshu.model.ChessMovePath;

public class IllegalMoveException extends ChessException {

    public IllegalMoveException(ChessBoardCoord coord) {
        super("Illegal move at " + coord);
    }

    public IllegalMoveException(ChessMovePath path, String message) {
        super(message + " for " + path);
    }

    public IllegalMoveException(String path, String message) {
        super(message + " for " + path);
    }
}
