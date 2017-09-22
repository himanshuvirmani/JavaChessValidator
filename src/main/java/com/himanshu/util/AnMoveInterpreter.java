package com.himanshu.util;


import com.himanshu.exceptions.IllegalMoveException;
import com.himanshu.model.ChessMovePath;

public interface AnMoveInterpreter {

    String convertMoveToAn(ChessPosition position, ChessMovePath move) throws IllegalMoveException;

    ChessMovePath convertAnToMove(ChessPosition position, String pgnMove) throws IllegalMoveException;

}
