package com.himanshu.util;


/**
 * Persist position without history.
 *
 * @author Yannick Kirschhoffer <alcibiade@alcibiade.org>
 */
public interface BoardInterpreter {

    String convertPositionToString(ChessPosition position);

    ChessPosition convertStringToPosition(String text);

}
