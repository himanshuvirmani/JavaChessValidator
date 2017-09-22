package com.himanshu.util;


public interface BoardInterpreter {

    String convertPositionToString(ChessPosition position);

    ChessPosition convertStringToPosition(String text);

}
